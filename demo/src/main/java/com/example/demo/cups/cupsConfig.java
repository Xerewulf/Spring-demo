package com.example.demo.cups;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class cupsConfig
{
    @Bean
    CommandLineRunner commandLineRunner(cupsRepository repository)
    {
        return args -> {
           Cups Mavi = new Cups(
                   1,

                    "pas",
                    "bah",
                    "oval" );

           Cups lacivert = new Cups(
                   2,

                   "home-Brit",
                   "English-Home",
                   "Silindir"
           );

           repository.saveAll(List.of(Mavi, lacivert));

        };
    }
}
