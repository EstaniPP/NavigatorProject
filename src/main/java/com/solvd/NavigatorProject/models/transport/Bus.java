package com.solvd.NavigatorProject.models.transport;

import com.solvd.NavigatorProject.models.user.Driver;

public class Bus {

	private Long id;
	private Long busLineId;
	private Long driverId;
	private Driver driver;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBusLineId(Long busLineId) {
		this.busLineId = busLineId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public Long getBusLineId() {
		return busLineId;
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
