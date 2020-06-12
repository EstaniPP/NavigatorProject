package com.solvd.NavigatorProject.navigationSolution;

import java.util.HashMap;
import java.util.PriorityQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.NavigatorProject.models.location.Route;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.services.StationService;

public class Navigator {

	private HashMap<Long, Station> stations;
	private StationService stationService;
	private final static Logger LOGGER = LogManager.getLogger(Navigator.class);
			
	public Navigator() {
		stationService = new StationService();
		stations = new HashMap<Long, Station>();
		stationService.getStations().stream().forEach(station -> stations.put(station.getId(),station));
	}
	
	//DIJSKTRA Solution
	public String getSolution(Station fromPoint, Station toPoint) {
		PriorityQueue<Path> paths = new PriorityQueue<Path>(new PathComparator()); //Create queue with all possible paths
		for(Route route : fromPoint.getRoutes()) {
			route.setStartStation(stations.get(route.getStartStationId()));
			route.setEndStation(stations.get(route.getEndStationId()));
			paths.add(new Path(route));
		}//Add all routes that begins with fromPoint station
		Path bestPath = null;
		try {
			bestPath = getBestPath(paths, toPoint);//Get the best path
		} catch (Exception e) {
			LOGGER.error(e);//If there is no possible path
		}
		return bestPath.toString();
	}
	
	private Path getBestPath(PriorityQueue<Path> paths, Station toPoint) throws Exception {
		if(paths.size()==0) {//If I try all possible paths and none reaches toPoint
			throw new Exception();
		}
		Path path = paths.poll();
		if(path.getStation().equals(toPoint)) {//If i reach tiPoint it returns the best path
			return path;
		}else {//else, I create all childs from this point and add them in order into the queue
			for(Route route : path.getStation().getRoutes()) {
				route.setStartStation(stations.get(route.getStartStationId()));
				route.setEndStation(stations.get(route.getEndStationId()));
				paths.add(new Path(path,route));
			}
			return getBestPath(paths, toPoint);
		}
	}	
}
