package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/")
	public String name()
	{
		return "Hello my name is Yogesh Jayachandran";
	}

}
