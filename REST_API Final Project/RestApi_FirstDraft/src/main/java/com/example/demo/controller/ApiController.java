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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.ModalEntity;
import com.example.demo.service.Serv;

@RestController
public class ApiController {
	
	@Autowired
	Serv sc;
	
	//Add single record
	@PostMapping("addrecord")
	public ModalEntity add(@RequestBody	ModalEntity me)
	{
		return sc.addinfo(me);
	}
	
	//Add multiple records
	@PostMapping("addnrecord")
	public List<ModalEntity> addndetails(@RequestBody List<ModalEntity> ss)
	{
		return sc.savedetails(ss);
	}
	
	//Displays whole table value
	@GetMapping("displayrecord")
	public List<ModalEntity>show()
	{
		return sc.showinfo();
	}
	
	//Display value based on ID
	@GetMapping("dispby/{id}")
	public Optional<ModalEntity> readbyId(@PathVariable  int id)
	{
		return sc.readId(id);
	}
	
	//Update the mentioned full record
	@PutMapping("updaterecord")
	public ModalEntity modify(@RequestBody ModalEntity me)
	{
		return sc.changeinfo(me);
	}
	
	//Updates by the ID specified
	@PutMapping("updatebyid/{id}")
	public String modifyit(@PathVariable int id, @RequestBody ModalEntity me)
	{
		return sc.updateinfo(id, me);
	}
	
	//Delete the full Record
	@DeleteMapping("deleterecord")
	public String del(@RequestBody ModalEntity me)
	{
		sc.deleteinfo(me);
		return "Deleted successfully!";
	}
	
	//Delete by the ID specified
	@DeleteMapping("delbyid/{id}")
	public String delmyid(@PathVariable int id)
	{
		sc.deleteid(id);
		return "Doneyyy...Deleted Successfully.";
	}
	
	//Delete by the parameter specified
	@DeleteMapping("delparamid")
	public String delmyparamid(@RequestParam int id)
	{
		sc.deletepid(id);
		return "Super...Deleted Successfully";
	}
}
