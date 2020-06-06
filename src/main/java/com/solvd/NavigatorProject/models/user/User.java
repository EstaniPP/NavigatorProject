package com.solvd.NavigatorProject.models.user;

import java.time.LocalDate;

public class User {
	private Long id;
	private String name;
	private String lastName;
	private LocalDate birthDate;
	private String address; 
	
	public User() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
