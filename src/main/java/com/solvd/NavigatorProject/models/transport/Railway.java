package com.solvd.NavigatorProject.models.transport;

import com.solvd.NavigatorProject.models.user.Driver;

public class Railway {

	private Long id;
	private Long railwayLineId;
	private Long driverId;
	private Driver driver;
	
	public Railway() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRailwayLineId(Long railwayLineId) {
		this.railwayLineId = railwayLineId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public Long getRailwayLineId() {
		return railwayLineId;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getDriverId() {
		return driverId;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Driver getDriver() {
		return driver;
	}
}
