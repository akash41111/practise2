package com.example.assignment3practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class Assignment3PractiseApplication {
	
	@GetMapping("/hello")
	public String message() {
		return "this is hello message";
	}

	public static void main(String[] args) {
		SpringApplication.run(Assignment3PractiseApplication.class, args);
		
		
	}

}
