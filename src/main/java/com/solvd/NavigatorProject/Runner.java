package com.solvd.NavigatorProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.NavigatorProject.exceptions.NonExistentStationException;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.navigationSolution.Navigator;
import com.solvd.NavigatorProject.services.StationService;

public class Runner {
	
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) throws NonExistentStationException {

		StationService stationService = new StationService();
		
		Station start = stationService.getStationByCoordinate(30.0, 30.0);
		if(start == null) {
			throw new NonExistentStationException();
		}
		
		Station end = stationService.getStationByCoordinate(60.0, 60.0);
		if(end == null) {
			throw new NonExistentStationException();
		}
		
		Navigator nav = new Navigator();
		LOGGER.info(nav.getSolution(start, end));
	}

}
