package com.solvd.NavigatorProject;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.NavigatorProject.exceptions.NonExistentStationException;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.navigationSolution.Navigator;
import com.solvd.NavigatorProject.navigationSolution.Path;
import com.solvd.NavigatorProject.services.BusLineService;
import com.solvd.NavigatorProject.services.RailwayLineService;
import com.solvd.NavigatorProject.services.StationService;

public class Runner {
	
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) throws NonExistentStationException {

		StationService stationService = new StationService();
		BusLineService busLineService = new BusLineService();
		RailwayLineService railwayLineService = new RailwayLineService();
		
		Station start = stationService.getStationByCoordinate(30.0, 30.0);
		if(start == null) {
			throw new NonExistentStationException();
		}
		
		Station end = stationService.getStationByCoordinate(60.0, 60.0);
		if(end == null) {
			throw new NonExistentStationException();
		}
		
		Navigator nav = new Navigator();
		Path result = nav.getSolution(start, end);
		result.getRoutes().forEach(r -> busLineService.getBusLinesByRoute(r.getId()));
		result.getRoutes().forEach(r -> railwayLineService.getRailwayLinesByRoute(r.getId()));
		//JSON section
				ObjectMapper mapper = new ObjectMapper();

				try {
					mapper.writeValue(new File("src/main/resources/result.json"), result);
				} catch (JsonGenerationException e) {
					LOGGER.error(e);
				} catch (JsonMappingException e) {
					LOGGER.error(e);
				} catch (IOException e) {
					LOGGER.error(e);
				}
	}

}
