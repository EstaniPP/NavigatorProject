package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.Entity;
import com.solvd.NavigatorProject.models.transport.BusLineRoute;
import com.solvd.NavigatorProject.models.transport.RailwayLineRoute;

public class Route extends Entity{
	private Long startStationId;
	private Long endStationId; 
	private List<RailwayLineRoute> railwayLineRoutes;
	private List<BusLineRoute> busLineRoutes;
	private Station startStation;
	private Station endStation;
	
	public Route() {
		
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
	
	public void setStartStation(Station startStation) {
		this.startStation = startStation;
	}
	
	public void setEndStation(Station endStation) {
		this.endStation = endStation;
	}
	
	public Station getStartStation() {
		return startStation;
	}
	
	public Station getEndStation() {
		return endStation;
	}
}
