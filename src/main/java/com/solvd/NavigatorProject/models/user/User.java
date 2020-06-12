package com.solvd.NavigatorProject.models.user;

import java.time.LocalDate;

import com.solvd.NavigatorProject.models.Entity;

public class User extends Entity{
	private String name;
	private String lastName;
	private LocalDate birthDate;
	private String address; 
	
	public User() {
		
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
