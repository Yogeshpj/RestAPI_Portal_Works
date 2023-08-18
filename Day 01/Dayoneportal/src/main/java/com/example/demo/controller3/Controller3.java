package com.example.demo.controller3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	@Value("${var1}")
	private String yourFavColor;
	
	@GetMapping("disp")
	public String getMYFav()
	{
		return "My favourite color is "+yourFavColor+"!";
	}


}
