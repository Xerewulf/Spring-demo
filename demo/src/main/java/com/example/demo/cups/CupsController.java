package com.example.demo.cups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "product/v2/index")
public class CupsController {

    private final CupService cupService;

    @Autowired
    public CupsController(CupService cupService) {
        this.cupService = cupService;
    }

    @GetMapping //here to get info outside our app to display on web page
    public List<Cups> getCups(){
        return cupService.getService();
    }


@PostMapping
    public void registerNewCups (@RequestBody Cups cups)
    {
        cupService.addNewCups(cups);
    }
@DeleteMapping(path = "{cupsId}")
    public void deleteCups(@PathVariable("cupsId") int id){
        cupService.deleteCups(id);

    }

@PutMapping(path = "{cupsId}")
public void updateStudent(@PathVariable("cupsId") int id,
                          @RequestParam(required = false) String name,
                          @RequestParam(required = false) String brand
                          ){
        cupService.updateCups(id, name,brand );
}

}
