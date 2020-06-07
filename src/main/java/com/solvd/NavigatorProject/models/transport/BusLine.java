package com.solvd.NavigatorProject.models.transport;

import java.util.List;

public class BusLine {

	private Long id;
	private Long name;
	private List<Bus> buses;
	
	public BusLine() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBuss(List<Bus> buses) {
		this.buses = buses;
	}
	
	public void setName(Long name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Bus> getBuses() {
		return buses;
	}
	
	public Long getName() {
		return name;
	}
	
	public Long getId() {
		return id;
	}	
}

