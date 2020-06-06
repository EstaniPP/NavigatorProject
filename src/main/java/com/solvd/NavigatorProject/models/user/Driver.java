package com.solvd.NavigatorProject.models.user;

public class Driver {
	private Long id; 
	private Long userId;
	private Double salary; 
	private License license; 
	private User user;
	
	public Driver() {
		
	}
	
	public Long getId() {
		return id;
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
	
	public void setId(Long id) {
		this.id = id;
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
