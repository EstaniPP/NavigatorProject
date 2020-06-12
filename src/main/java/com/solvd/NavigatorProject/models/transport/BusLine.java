package com.solvd.NavigatorProject.models.transport;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.solvd.NavigatorProject.models.Entity;

public class BusLine extends Entity{
	
	private String name;
	@JsonIgnore
	private List<Bus> buses;
	
	public BusLine() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Bus> getBuses() {
		return buses;
	}
	
	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}
}

