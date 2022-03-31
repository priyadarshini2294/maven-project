package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestService {
	
	@GetMapping("/")
	public String getValue(){
		System.out.println("Hello");
		return "Hello";
	}
}
