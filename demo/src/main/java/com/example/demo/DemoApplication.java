package com.example.demo;

import com.example.demo.cups.Cups;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/") //here to get info outside our app to display on web page
	public List<Cups> setCon(){
		return List.of(

new Cups(	1,

		"pas",
		"bah",
		"oval" )
				);
	}
	@GetMapping("/hello")
		public String deneme(){
			return "deneme for another page in my app";
		}


}

