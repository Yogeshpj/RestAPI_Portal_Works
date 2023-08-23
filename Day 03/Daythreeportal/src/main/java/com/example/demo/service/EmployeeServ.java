package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modals.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServ {

	@Autowired
	
	EmployeeRepo er;
	
	public Employee saveinfo(Employee ee)
	{
		return er.save(ee);
	}
	public List<Employee> showinfo()
	{
		return er.findAll();
	}
	public Optional<Employee> readId(int id)
	{
		return er.findById(id);
	}
}
