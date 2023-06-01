package com.example.demo.cups;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class CupService {

    public List<Cups> getService(){
        return List.of(

                new Cups(	1,
                        12,
                        "pas",
                        "bah",
                        "oval" )
            ) ;
        }
    }
