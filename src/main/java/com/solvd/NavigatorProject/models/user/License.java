package com.solvd.NavigatorProject.models.user;

import java.time.LocalDate;

import com.solvd.NavigatorProject.models.Entity;

public class License extends Entity{
	
	private String number;
	private Long driverId;
	private LocalDate expirationDate;
	
	public License() {
		
	}
	
	public String getNumber() {
		return number;
	}
	
	public Long getDriverId() {
		return driverId;
	}
	
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
}
