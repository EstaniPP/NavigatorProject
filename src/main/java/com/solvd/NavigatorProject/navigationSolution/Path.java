package com.solvd.NavigatorProject.navigationSolution;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.solvd.NavigatorProject.models.location.Route;
import com.solvd.NavigatorProject.models.location.Station;

public class Path{
	
	private ArrayList<Route> routes;
	
	@SuppressWarnings("unchecked")
	public Path(Path path, Route route) {
		this.routes = (ArrayList<Route>) path.getRoutes().clone();
		routes.add(route);
	}
	
	public Path(Route route) {
		this.routes = new ArrayList<Route>();
		routes.add(route);
	}

	public Path() {
		// TODO Auto-generated constructor stub
	}

	@JsonIgnore
	public Station getStation() {
		return routes.get(routes.size()-1).getEndStation(); //RETURN END STATION OF THE PATH
	}
	
	public Double getTotalDistance() {		
		return routes.stream().mapToDouble(r -> getDistance(r)).sum();
	}

	public ArrayList<Route> getRoutes() {
		return routes;
	}
	
	private Double getDistance(Route r) {
		Integer latitudeDifference = r.getStartStation().getLatitude() - r.getEndStation().getLatitude();
		Integer longitudeDifference = r.getStartStation().getLongitude() - r.getEndStation().getLongitude();
		return Math.sqrt(Math.pow(latitudeDifference,2)+Math.pow(longitudeDifference, 2));
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(routes.get(0).getStartStation().getName());
		routes.stream().forEach(r -> str.append(" to "+r.getEndStation().getName()));
		return str.toString();
	}

}
