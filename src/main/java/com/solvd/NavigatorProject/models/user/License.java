package com.solvd.NavigatorProject.models.user;

import java.time.LocalDate;

public class License {
	private Long id;
	private String number;
	private Long driverId;
	private LocalDate expirationDate;
	
	public License() {
		
	}
	
	public Long getId() {
		return id;
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
	
	public void setId(Long id) {
		this.id = id;
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
