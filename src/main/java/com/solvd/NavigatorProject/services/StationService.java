package com.solvd.NavigatorProject.services;

import java.util.List;
import com.solvd.NavigatorProject.DAO.IRouteDAO;
import com.solvd.NavigatorProject.DAO.IStationDAO;
import com.solvd.NavigatorProject.exceptions.NonExistentStationException;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.myBatis.SqlSession;

public class StationService {

	private IStationDAO stationDAO;
	private IRouteDAO routeDAO;
	
	public StationService() {
		stationDAO = SqlSession.getInstance().openSession(true).getMapper(IStationDAO.class);
		routeDAO = SqlSession.getInstance().openSession(true).getMapper(IRouteDAO.class);
	}
	
	public List<Station> getStations(){
		List<Station> stations = stationDAO.getEntities();
		stations.stream().forEach(station -> {
			station.setRoutes(routeDAO.getRoutesByStartStationId(station.getId()));
		});
		return stations;
	}
	
	public Station getStationByCoordinate(Integer latitude, Integer longitude) throws NonExistentStationException{
		Station station = stationDAO.getStationByCoordinate(latitude, longitude);
		if(station == null) {
			throw new NonExistentStationException();
		}
		station.setRoutes(routeDAO.getRoutesByStartStationId(station.getId()));
		return station;
	}
}
