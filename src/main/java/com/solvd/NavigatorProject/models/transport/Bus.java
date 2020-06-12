package com.solvd.NavigatorProject.models.transport;

import com.solvd.NavigatorProject.models.Entity;
import com.solvd.NavigatorProject.models.user.Driver;

public class Bus extends Entity{

	private Long busLineId;
	private Long driverId;
	private Driver driver;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBusLineId(Long busLineId) {
		this.busLineId = busLineId;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public Long getBusLineId() {
		return busLineId;
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
