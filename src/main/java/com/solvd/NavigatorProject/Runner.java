package com.solvd.NavigatorProject;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.navigationSolution.Navigator;
import com.solvd.NavigatorProject.services.StationService;

public class Runner {
	
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {

		StationService stationService = new StationService();
		Station start = stationService.getStationById(Integer.toUnsignedLong(1));
		Station end = stationService.getStationById(Integer.toUnsignedLong(6));
		
		Navigator nav = new Navigator();
		
		List<Station> actualPath = new ArrayList<Station>();
		
		LOGGER.info(nav.getSolution(start, end));
		actualPath.stream().forEach(st -> LOGGER.info(st.getName()));
		LOGGER.info(actualPath.size());
	}

}
