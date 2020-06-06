package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.transport.BusLineRoute;
import com.solvd.NavigatorProject.models.transport.RailwayLineRoute;

public class Route {
	private Long id; 
	private Long startStationId;
	private Long endStationId; 
	private List<RailwayLineRoute> railwayLineRoutes;
	private List<BusLineRoute> busLineRoutes;
	
	public Route() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getStartStationId() {
		return startStationId;
	}
	
	public Long getEndStationId() {
		return endStationId;
	}
	
	public List<RailwayLineRoute> getRailwayLineRoutes() {
		return railwayLineRoutes;
	}
	
	public List<BusLineRoute> getBusLineRoutes() {
		return busLineRoutes;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setStartStationId(Long startStationId) {
		this.startStationId = startStationId;
	}
	
	public void setEndStationId(Long endStationId) {
		this.endStationId = endStationId;
	}
	
	public void setRailwayLineRoutes(List<RailwayLineRoute> railwayLineRoutes) {
		this.railwayLineRoutes = railwayLineRoutes;
	}
	
	public void setBusLineRoutes(List<BusLineRoute> busLineRoutes) {
		this.busLineRoutes = busLineRoutes;
	}
}
