package com.solvd.NavigatorProject.models.transport;

import com.solvd.NavigatorProject.models.Entity;

public class BusLineRoute extends Entity{
	private Long busLineId;
	private Long routeId;
	
	public BusLineRoute() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	
	public void setBusLineId(Long busLineId) {
		this.busLineId = busLineId;
	}
	
	public Long getRouteId() {
		return routeId;
	}
	
	public Long getBusLineId() {
		return busLineId;
	}
}
