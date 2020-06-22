package com.solvd.NavigatorProject;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.NavigatorProject.exceptions.NonExistentPathException;
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
		
		//THROW NON EXISTENT STATION EXCEPTION
		try {
			start = stationService.getStationByCoordinate(100, 100);
		} catch (NonExistentStationException e) {
			LOGGER.error(e);
		}
		
		try {
			start = stationService.getStationByCoordinate(340, 60);
		} catch (NonExistentStationException e) {
			LOGGER.error(e);
		}
		
		LOGGER.info(start.toString());
		
		Station end = null;
		try {
			end = stationService.getStationByCoordinate(400, 450);
		} catch (NonExistentStationException e) {
			LOGGER.error(e);
		}
		
		LOGGER.info(end.toString());
		
		//JSON result section
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		Navigator nav = new Navigator();
		Path result = null;
		
		//THROW NON EXISTENT PATH EXCEPTION 
		try {
			result = nav.getSolution(end, start);
			result.getRoutes().forEach(r -> {
				r.setBusLine(busLineService.getBusLinesByRoute(r.getId()));
				r.setRailwayLine(railwayLineService.getRailwayLinesByRoute(r.getId()));
			});
			try {
				mapper.writeValue(new File("src/main/resources/result.json"), result);
			} catch (JsonGenerationException e) {
				LOGGER.error(e);
			} catch (JsonMappingException e) {
				LOGGER.error(e);
			} catch (IOException e) {
				LOGGER.error(e);
			}
		} catch (NonExistentPathException e1) {
			LOGGER.error(e1);
			try {
				mapper.writeValue(new File("src/main/resources/result.json"), "There are no available routes, please take a cab to reach your destination");
			} catch (JsonGenerationException e) {
				LOGGER.error(e);
			} catch (JsonMappingException e) {
				LOGGER.error(e);
			} catch (IOException e) {
				LOGGER.error(e);
			}
		}
		
		try {
			result = nav.getSolution(start, end);
			result.getRoutes().forEach(r -> {
				r.setBusLine(busLineService.getBusLinesByRoute(r.getId()));
				r.setRailwayLine(railwayLineService.getRailwayLinesByRoute(r.getId()));
			});
			try {
				mapper.writeValue(new File("src/main/resources/result.json"), result);
			} catch (JsonGenerationException e) {
				LOGGER.error(e);
			} catch (JsonMappingException e) {
				LOGGER.error(e);
			} catch (IOException e) {
				LOGGER.error(e);
			}
		} catch (NonExistentPathException e1) {
			LOGGER.error(e1);
			try {
				mapper.writeValue(new File("src/main/resources/result.json"), "There are no available routes, please take a cab to reach your destination");
			} catch (JsonGenerationException e) {
				LOGGER.error(e);
			} catch (JsonMappingException e) {
				LOGGER.error(e);
			} catch (IOException e) {
				LOGGER.error(e);
			}
		}
	}
}
