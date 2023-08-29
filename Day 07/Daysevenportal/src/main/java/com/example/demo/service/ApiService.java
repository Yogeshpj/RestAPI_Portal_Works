package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.modal.ApiController;
import com.example.demo.repository.CarRepo;

@Controller
public class ApiService {

	@Autowired 
	CarRepo cr;
	
	public ApiController saveowner(ApiController me)
	{
		return cr.save(me);
	}
	
	public List<ApiController> get(int s)
	{
		return cr.getinfo(s);
	}
	
	public List<ApiController> gets1(String str)
	{
		return cr.getstrinfo(str);
	}
	
	public List<ApiController> gets2(String str)
	{
		return cr.getstr1info(str);
	}
	
	public List<ApiController> getand(int s, String b)
	{
		return cr.getandinfo(s,b);
	}
}
