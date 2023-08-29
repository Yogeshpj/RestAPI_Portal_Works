package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.ApiController;
import com.example.demo.service.ApiService;

@RestController
public class Car {
	
	@Autowired
	ApiService sc;
	
	@PostMapping("/")
	public ApiController add(@RequestBody ApiController ss)
	{
		return sc.saveowner(ss);
	}
	
	@GetMapping("owners/{id}")
	public List<ApiController> displayall(@PathVariable int id)
	{
		return sc.get(id);
	}
	
	@GetMapping("address/{name}")
	public List<ApiController> display(@PathVariable String name)
	{
		return sc.gets1(name);
	}
	
	@GetMapping("carname/{name}")
	public List<ApiController> displall(@PathVariable String name)
	{
		return sc.gets2(name);
	}
	
	@GetMapping("owners/{owners}/cartype{cartype}")
	public List<ApiController> displayall(@PathVariable int id, @PathVariable String name)
	{
		return sc.getand(id, name);
	}
}
