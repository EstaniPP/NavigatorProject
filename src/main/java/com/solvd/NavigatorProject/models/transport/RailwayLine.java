package com.solvd.NavigatorProject.models.transport;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.solvd.NavigatorProject.models.Entity;

public class RailwayLine extends Entity{

	private String name;
	@JsonIgnore
	private List<Railway> railways;
	
	public RailwayLine() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Railway> getRailways() {
		return railways;
	}
	
	public void setRailways(List<Railway> railways) {
		this.railways = railways;
	}
}
