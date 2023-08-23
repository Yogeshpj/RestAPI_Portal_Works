package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServ {
	
	@Autowired
	
	StudentRepo ss;
	
	public Student saveinfo(Student sc)
	{
		return ss.save(sc);
	}
	
	public List<Student> showinfo()
	{
		return ss.findAll();
	}
	
	public Optional<Student> showbyid(int id)
	{
		return ss.findById(id);
	}
	
	public Optional<Student> updateinfo(int id, Student sc)
	{
		ss.saveAndFlush(sc);
		
		if(ss.existsById(id))
		{
			return ss.findById(id);
		}
		else
		{
			return Optional.empty();
		}
	}
	
	public void deletepid(int id)
	{
		ss.deleteById(id);
	}
	
	public Optional<Student> readId(int id)
	{
		return ss.findById(id);
	}
}
