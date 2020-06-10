package com.solvd.NavigatorProject.models.location;

import java.util.List;

public class Station {
	private Long id; 
	private String name;
	private String address;
	private Double latitude;
	private Double longitude; 
	private Long cityId;
	private List<Route> routes;
	
	public Station() {
		
	}
	
	public Long getId() {
		return id;
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
	
	public void setId(Long id) {
		this.id = id;
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
	
	@Override
	public boolean equals(Object obj) {
		return ((Station)obj).getId() == id;
	}
}
