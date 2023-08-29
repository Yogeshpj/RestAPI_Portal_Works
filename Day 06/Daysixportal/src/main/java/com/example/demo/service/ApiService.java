package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Child;
import com.example.demo.repository.ChildRepo;

@Service
public class ApiService {

	@Autowired
	ChildRepo c;
	
	public List<Child> show()
	{
		return c.findAll();
	}
	
	public Child add(Child v)
	{
		return c.save(v);
	}
	
	public List<Child> getSorted(String str)
	{
		return c.findAll(Sort.by(Sort.DEFAULT_DIRECTION, str));
	}
	
	public List<Child> getPageonly(int pgno,int pgsize)
	{
		Page<Child> p = c.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<Child> getPage(int pgno,int pgsize,Sort.Direction dt,String str)
	{
		Page<Child> p = c.findAll(PageRequest.of(pgno, pgsize, dt, str));
		return p.getContent();
	}
}
