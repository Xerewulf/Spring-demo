package com.example.demo.cups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
