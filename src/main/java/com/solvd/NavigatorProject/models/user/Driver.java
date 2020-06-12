package com.solvd.NavigatorProject.models.user;

import com.solvd.NavigatorProject.models.Entity;

public class Driver extends Entity{
	private Long userId;
	private Double salary; 
	private License license; 
	private User user;
	
	public Driver() {
		
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public License getLicense() {
		return license;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void setLicense(License license) {
		this.license = license;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
