package com.solvd.NavigatorProject.models.transport;

public class RailwayLineRoute {
	private Long id;
	private Long railwayLineId;
	private Long routeId;
	
	public RailwayLineRoute() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setRailwayLineId(Long railwayLineId) {
		this.railwayLineId = railwayLineId;
	}
	
	public Long getRouteId() {
		return routeId;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getRailwayLineId() {
		return railwayLineId;
	}
}