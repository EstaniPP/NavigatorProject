package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.solvd.NavigatorProject.models.Entity;
import com.solvd.NavigatorProject.models.transport.BusLine;
import com.solvd.NavigatorProject.models.transport.RailwayLine;

@JsonPropertyOrder({ "startStationName", "endStationName", "busLines", "railwayLines" })
public class Route extends Entity{
	@JsonIgnore
	private Long startStationId;
	@JsonIgnore
	private Long endStationId; 
	private List<RailwayLine> railwayLines;
	private List<BusLine> busLines;
	@JsonIgnore
	private Station startStation;
	@JsonIgnore
	private Station endStation;
	
	public Route() {
		
	}
	
	public Long getStartStationId() {
		return startStationId;
	}
	
	public Long getEndStationId() {
		return endStationId;
	}
	
	public void setStartStationId(Long startStationId) {
		this.startStationId = startStationId;
	}
	
	public void setEndStationId(Long endStationId) {
		this.endStationId = endStationId;
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
	
	public void setRailwayLine(List<RailwayLine> railwayLine) {
		this.railwayLines = railwayLine;
	}
	
	public void setBusLine(List<BusLine> busLine) {
		this.busLines = busLine;
	}
	
	public List<RailwayLine> getRailwayLines() {
		return railwayLines;
	}
	
	public List<BusLine> getBusLines() {
		return busLines;
	}
	
	public String getStartStationName() {
		return "from: " + startStation.getName() + "(" + startStation.getAddress() + ")";
	}
	
	public String getEndStationName() {
		return "to: " + endStation.getName() + "(" + endStation.getAddress() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Route)) return false;
		Route r = (Route) obj;
		return (this.getId() == r.getId());
	}
}
