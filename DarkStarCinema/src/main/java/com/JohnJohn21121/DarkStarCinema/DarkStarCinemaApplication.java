package com.JohnJohn21121.DarkStarCinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DarkStarCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarkStarCinemaApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){
		return "Welcome to John´s Dark-Star Cinema Api";
	}

}
