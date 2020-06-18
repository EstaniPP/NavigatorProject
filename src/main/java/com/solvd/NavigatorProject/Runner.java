package com.solvd.NavigatorProject;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.NavigatorProject.exceptions.NonExistentStationException;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.navigationSolution.Navigator;
import com.solvd.NavigatorProject.navigationSolution.Path;
import com.solvd.NavigatorProject.services.BusLineService;
import com.solvd.NavigatorProject.services.RailwayLineService;
import com.solvd.NavigatorProject.services.StationService;

public class Runner {
	
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {

		StationService stationService = new StationService();
		BusLineService busLineService = new BusLineService();
		RailwayLineService railwayLineService = new RailwayLineService();
		
		Station start = null;
		try {
			start = stationService.getStationByCoordinate(200.0, 200.0);
		} catch (NonExistentStationException e) {
			LOGGER.error(e);
		}
		
		Station end = null;
		try {
			end = stationService.getStationByCoordinate(100.0, 100.0);
		} catch (NonExistentStationException e) {
			LOGGER.error(e);
		}
		
		Navigator nav = new Navigator();
		Path result = nav.getSolution(start, end);
		if(result != null) {
			result.getRoutes().forEach(r -> {
				r.setBusLine(busLineService.getBusLinesByRoute(r.getId()));
				r.setRailwayLine(railwayLineService.getRailwayLinesByRoute(r.getId()));
			});
		}
		
		//JSON result section
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		try {
			mapper.writeValue(new File("src/main/resources/result.json"), result != null ? result : "Non existent path");
		} catch (JsonGenerationException e) {
			LOGGER.error(e);
		} catch (JsonMappingException e) {
			LOGGER.error(e);
		} catch (IOException e) {
			LOGGER.error(e);
		}
	}
}
