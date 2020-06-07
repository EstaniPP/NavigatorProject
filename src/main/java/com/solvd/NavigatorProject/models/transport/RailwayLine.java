package com.solvd.NavigatorProject.models.transport;

import java.util.List;

public class RailwayLine {

	private Long id;
	private Long name;
	private List<Railway> railways;
	
	public RailwayLine() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRailways(List<Railway> railways) {
		this.railways = railways;
	}
	
	public void setName(Long name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Railway> getRailways() {
		return railways;
	}
	
	public Long getName() {
		return name;
	}
	
	public Long getId() {
		return id;
	}	
}
