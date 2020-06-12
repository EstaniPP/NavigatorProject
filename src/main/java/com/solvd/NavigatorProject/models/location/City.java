package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.Entity;

public class City extends Entity{
	private String name;
	private List<Station> stations; 
	
	public City() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public List<Station> getStations() {
		return stations;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}
}
