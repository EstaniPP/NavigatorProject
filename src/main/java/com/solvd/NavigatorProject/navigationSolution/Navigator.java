package com.solvd.NavigatorProject.navigationSolution;

import java.util.HashMap;
import java.util.PriorityQueue;

import com.solvd.NavigatorProject.exceptions.NonExistentPathException;
import com.solvd.NavigatorProject.models.location.Route;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.services.StationService;

public class Navigator {

	private HashMap<Long, Station> stations;
	private StationService stationService;
			
	public Navigator() {
		stationService = new StationService();
		stations = new HashMap<Long, Station>();
		stationService.getStations().stream().forEach(station -> stations.put(station.getId(),station));
	}
	
	//DIJSKTRA solution
	public Path getSolution(Station fromPoint, Station toPoint) throws NonExistentPathException{
		//Create queue with all possible paths
		PriorityQueue<Path> paths = new PriorityQueue<Path>(new PathComparator()); 
		//Add all routes that begins with fromPoint station
		for(Route route : fromPoint.getRoutes()) {
			route.setStartStation(stations.get(route.getStartStationId()));
			route.setEndStation(stations.get(route.getEndStationId()));
			paths.add(new Path(route));
		}
		//Get the best path - recursive method
		Path bestPath = getBestPath(paths, toPoint);
		return bestPath;
	}
	
	private Path getBestPath(PriorityQueue<Path> paths, Station toPoint) throws NonExistentPathException {
		//If all possible paths are tried and none reaches toPoint
		if(paths.size()==0) {
			throw new NonExistentPathException();
		}
		//Take the shortest path from queue
		Path path = paths.poll();
		//If it reaches toPoint, it returns the shortest path
		if(path.getStation().equals(toPoint)) {
			return path;
		}
		//Else, it creates all child routes from this point and add them to the queue (ordered)
		else {
			for(Route route : path.getStation().getRoutes()) {
				//Avoid cycles 
				if(!path.getRoutes().contains(route)) {
					route.setStartStation(stations.get(route.getStartStationId()));
					route.setEndStation(stations.get(route.getEndStationId()));
					paths.add(new Path(path,route));
				}
			}
			//Recursion
			return getBestPath(paths, toPoint);
		}
	}	
}
