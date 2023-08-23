package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.ModalEntity;
import com.example.demo.repository.Repo;

@Service
public class Serv {

	@Autowired
	Repo r;
	
	//POST
	public ModalEntity addinfo(ModalEntity me)
	{
		return r.save(me);
	}
	
	//nPOST
	public List<ModalEntity> savedetails(List<ModalEntity> me)
	{
		return (List<ModalEntity>)r.saveAll(me);
	}
	
	//GET
	public List<ModalEntity> showinfo()
	{
		return r.findAll();
	}
	
	//GETbyID
	public Optional<ModalEntity> readId(int id)
	{
		return r.findById(id);
	}
	
	//PUT
	public ModalEntity changeinfo(ModalEntity me)
	{
		return r.saveAndFlush(me);
	}
	
	//PUTbyid
	public String updateinfo(int id, ModalEntity ss)
	{
		r.saveAndFlush(ss);
		
		if(r.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	
	//DELETE
	public void deleteinfo(ModalEntity me)
	{
		r.delete(me);
	}
	
	//deletebyID for pathvariable
	public void deleteid(int id)
	{
		r.deleteById(id);
	}
	
	//deletebyQuery
	public void deletepid(int id)
	{
		r.deleteById(id);
	}
}
