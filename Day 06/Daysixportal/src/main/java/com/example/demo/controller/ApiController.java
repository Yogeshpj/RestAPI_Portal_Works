package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Child;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService sc;
	
	@GetMapping("full")
	public List<Child> disp()
	{
		return sc.show();
	}
	
	@GetMapping("/{name}")
	public List<Child> sortinfo(@PathVariable String name)
	{
		return sc.getSorted(name);
	}
	
	@PostMapping("/")
	public Child add(@RequestBody Child ss)
	{
		return sc.add(ss);
	}
	
	@GetMapping("paging/{pgno}/{pgsize}")
	public List<Child> showpginfo(@PathVariable int pgno, @PathVariable int pgsize)
	{
		return sc.getPageonly(pgno, pgsize);
	}
	@GetMapping("paging/{pgno}/{pgsize}/{dr}/{str}")
	public List<Child> showpginfowithsort(@PathVariable int pgno, @PathVariable int pgsize ,@PathVariable Sort.Direction dr, @PathVariable String str)
	{
		return sc.getPage(pgno, pgsize,dr,str);
	}
}
