package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class CicdApplication {


	@GetMapping(value = "/welcome")
	public String welcome(){
		return "This is my first project";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
