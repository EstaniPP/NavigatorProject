package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.Entity;

public class City extends Entity{
	private String name;
	private List<Address> addresses; 
	
	public City() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
