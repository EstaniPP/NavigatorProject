package com.solvd.NavigatorProject.navigationSolution;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

import com.solvd.NavigatorProject.models.location.Route;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.services.StationService;

public class Navigator {

//	private HashMap<Long, Station> stations;
	private StationService stationService;
//	
	public Navigator() {
		stationService = new StationService();
//		stations = new HashMap<Long, Station>();
//		stationService.getStations().stream().forEach(station -> stations.put(station.getId(),station));
	}
//	
//	public String getSolution(Station fromPoint, Station toPoint) {
//		PriorityQueue<Path> paths = new PriorityQueue<Path>();
//		Path bestPath = getBestPath(paths, toPoint);
//		return bestPath.toString();
//	}
	
//	private Path getBestPath(PriorityQueue<Path> paths, Station toPoint) throws Exception {
//		if(paths.size()==0) {
//			throw new Exception();
//		}
//		Path path = paths.poll();
//		if(path.getStation().equals(toPoint)) {
//			return path;
//		}else {
//			path.getStation().getRoutes().stream().forEach(route -> paths.add(new Path(paths,route)));
//			return getBestPath(paths,toPoint);
//		}
//	}
	
//	private Double getDistance(Route r) {
//		Double latitudeDifference = stations.get(r.getStartStationId()).getLatitude() - stations.get(r.getEndStationId()).getLatitude();
//		Double longitudeDifference = stations.get(r.getStartStationId()).getLongitude() - stations.get(r.getEndStationId()).getLongitude();
//		return Math.sqrt(Math.pow(latitudeDifference,2)+Math.pow(longitudeDifference, 2));
//	}
	
	//MAXI'S SOLUTION
	
	public List<Station> getPath(Station start, Station end, List<Station> actualPath) {
		List<Station> posibleStations = stationService.findStations(start.getId());
		for(Station station : posibleStations) {
			actualPath.add(start);
			if (station.getId() == end.getId()) {
				actualPath.add(end);
				return actualPath;
			}
			else {
				getPath(station, end, actualPath);
			}
			if(actualPath.get(actualPath.size()-1).getId() == end.getId()) {
				break;
			}
			else {
				actualPath.remove(actualPath.size()-1);
			}
		}
		return actualPath;
	}
	
}
