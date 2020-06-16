package com.solvd.NavigatorProject.models.location;

import java.util.List;

import com.solvd.NavigatorProject.models.Entity;

public class Station extends Entity{
	private String name;
	private String address;
	private Double latitude;
	private Double longitude; 
	private Long cityId;
	private List<Route> routes;
	private City city;
	
	public Station() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public Long getCityId() {
		return cityId;
	}
	
	public List<Route> getRoutes() {
		return routes;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Station)) return false;
		Station s = (Station) obj;
		return (this.getId() == s.getId());
	}
}
