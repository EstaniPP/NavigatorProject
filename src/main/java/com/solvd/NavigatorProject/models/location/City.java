package com.solvd.NavigatorProject.models.location;

import java.util.List;

public class City {
	private Long id;
	private String name;
	private List<Station> stations; 
	
	public City() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Station> getStations() {
		return stations;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}
}
