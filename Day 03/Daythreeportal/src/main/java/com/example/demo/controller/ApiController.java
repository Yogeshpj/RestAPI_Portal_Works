package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modals.Employee;
import com.example.demo.service.EmployeeServ;

@RestController
public class ApiController {
	@Autowired
	
	EmployeeServ es;
	
	@PostMapping("/")
	public Employee add(@RequestBody Employee ss)
	{
		return es.saveinfo(ss);
	}

	@GetMapping("/")
	public List<Employee>show()
	{
		return es.showinfo();
	}
	
	@GetMapping("{id}")
	public Optional<Employee> readbyId(@PathVariable  int id)
	{
		return es.readId(id);
	}
}
