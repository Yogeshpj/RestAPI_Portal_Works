package com.example.demo.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK_REVIEWS")
public class ModalEntity {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_ID")
	private int id;
	@Column(name = "Book_Name")
	private String name;
	@Column(name = "Author")
	private String auth;
	@Column(name = "Description",columnDefinition = "TEXT")
	private String descr;
	@Column(name = "YOP")
	private int year;
	@Column(name = "Review",columnDefinition = "TEXT")
	private String rev;
	
	public ModalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModalEntity(int id, String name, String auth, String descr, int year, String rev) {
		super();
		this.id = id;
		this.name = name;
		this.auth = auth;
		this.descr = descr;
		this.year = year;
		this.rev = rev;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

	
}