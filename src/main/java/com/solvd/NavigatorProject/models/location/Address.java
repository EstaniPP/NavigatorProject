package com.solvd.NavigatorProject.models.location;

import com.solvd.NavigatorProject.models.Entity;

public class Address extends Entity{
	private String street;
	private Integer number; 
	private Integer floor; 
	private String apartment;
	private Long cityId;
	
	public Address() {
		
	}
	
	public String getStreet() {
		return street;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public Integer getFloor() {
		return floor;
	}
	
	public String getApartment() {
		return apartment;
	}
	
	public Long getCityId() {
		return cityId;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
}
