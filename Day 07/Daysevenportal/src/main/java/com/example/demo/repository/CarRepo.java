package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.ApiController;

@Repository
public interface CarRepo extends JpaRepository<ApiController, Integer>{

	@Query(value = "select* from api_controller where owners=:s",nativeQuery = true)
	public List<ApiController> getinfo(@Param("s") int id);
	
	@Query(value = "select* from api_controller where address=:s",nativeQuery = true)
	public List<ApiController> getstrinfo(@Param("s") String str);
	
	@Query(value = "select* from api_controller where carName=:s",nativeQuery = true)
	public List<ApiController> getstr1info(@Param("s") String str);
	
	@Query(value = "select* from api_controller where owners=:s and carType=:d",nativeQuery = true)
	public List<ApiController> getandinfo(@Param("s") int id, @Param("d") String name);
}
