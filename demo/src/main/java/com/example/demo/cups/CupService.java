package com.example.demo.cups;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CupService {

    private final cupsRepository cupsrepository;

    public CupService(cupsRepository cupsrepository) {
        this.cupsrepository = cupsrepository;
    }

    public List<Cups> getService(){
       return cupsrepository.findAll();
        }


    public void addNewCups(Cups cups) {

        Optional<Cups> cupsById = cupsrepository.findCupsByName(cups.getName());

    if(cupsById.isPresent()){
        throw new IllegalStateException("name is taken");
    }
    cupsrepository.save(cups);
    }

    public void deleteCups(int id) {
    boolean exist = cupsrepository.existsById(id);

    if(!exist){
        throw new IllegalStateException("cups with this id is not exist");
    }
    cupsrepository.deleteById(id);

    }

    @Transactional
    public void updateCups(int id, String name, String brand) {

        Cups cups = cupsrepository.findCupsByName(name).orElseThrow(()-> new IllegalStateException("No cups found with that name"));


        if (name != null && name.length()>0 && !Objects.equals(cups.getName(),name)){ cups.setName(name); }

    }
}
