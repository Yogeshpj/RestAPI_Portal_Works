package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Modal;
import com.example.demo.repositary.Repo;

@Service
public class Serv {

	@Autowired
	Repo ss;
	
	public Modal saveinfo(Modal sc)
	{
		return ss.save(sc);
	}
	
	public List<Modal> showinfo()
	{
		return ss.findAll();
	}
	
	public Optional<Modal> showbyid(int id)
	{
		return ss.findById(id);
	}
	
	public Optional<Modal> updateinfo(int id, Modal sc)
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
	
	public Optional<Modal> readId(int id)
	{
		return ss.findById(id);
	}
}
