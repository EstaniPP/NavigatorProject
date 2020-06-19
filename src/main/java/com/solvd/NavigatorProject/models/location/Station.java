package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.Entity;

public class Station extends Entity{
	private String name;
	private Integer latitude;
	private Integer longitude;
	private Long addressId;
	private List<Route> routes;
	
	public Station() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getLatitude() {
		return latitude;
	}
	
	public Integer getLongitude() {
		return longitude;
	}
	
	public Long getAddressId() {
		return addressId;
	}
	
	public List<Route> getRoutes() {
		return routes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Station)) return false;
		Station s = (Station) obj;
		return (this.getId() == s.getId());
	}
	
	@Override
	public String toString() {
		return "STATION- id: " + this.getId() + " |name: " + this.getName() + " |coordinates: " + this.getLatitude() + " | " + this.getLongitude();
	}
}
