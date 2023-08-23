package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Student;
import com.example.demo.service.StudentServ;

@RestController
public class ApiController {
	
	@Autowired
	StudentServ sc;
	
	@PostMapping("/")
	public Student add(@RequestBody Student ss)
	{
		return sc.saveinfo(ss);
	}
	
	@GetMapping("getbyid/{id}")
	public Optional<Student> readbyId(@PathVariable  int id)
	{
		return sc.readId(id);
	}
	
	@GetMapping("/")
	public List<Student>show()
	{
		return sc.showinfo();
	}
	
	@PutMapping("putbyid/{id}")
	public Optional<Student> modifyit(@PathVariable int id, @RequestBody Student ss)
	{
		return sc.updateinfo(id, ss);
	}
	
	@DeleteMapping("delbyid/{id}")
	public String delmyid(@PathVariable int id)
	{
		sc.deletepid(id);
		return "Deleted Successfully.its Done";
	}
}
