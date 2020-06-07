package com.solvd.NavigatorProject.models.transport;

public class BusLineRoute {
	private Long id;
	private Long busLineId;
	private Long routeId;
	
	public BusLineRoute() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setBusLineId(Long busLineId) {
		this.busLineId = busLineId;
	}
	
	public Long getRouteId() {
		return routeId;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getBusLineId() {
		return busLineId;
	}
}
