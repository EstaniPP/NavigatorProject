package com.solvd.NavigatorProject.models.transport;

import com.solvd.NavigatorProject.models.Entity;

public class RailwayLineRoute extends Entity{
	private Long railwayLineId;
	private Long routeId;
	
	public RailwayLineRoute() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	
	public void setRailwayLineId(Long railwayLineId) {
		this.railwayLineId = railwayLineId;
	}
	
	public Long getRouteId() {
		return routeId;
	}
	
	public Long getRailwayLineId() {
		return railwayLineId;
	}
}