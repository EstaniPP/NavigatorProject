package com.solvd.NavigatorProject.services;

import java.util.ArrayList;
import java.util.List;

import com.solvd.NavigatorProject.DAO.IBusLineDAO;
import com.solvd.NavigatorProject.DAO.IBusLineRouteDAO;
import com.solvd.NavigatorProject.models.transport.BusLine;
import com.solvd.NavigatorProject.myBatis.SqlSession;

public class BusLineService {

	IBusLineDAO busLineDAO;
	IBusLineRouteDAO busLineRouteDAO;
	
	public BusLineService() {
		busLineDAO = SqlSession.getInstance().openSession(true).getMapper(IBusLineDAO.class);
		busLineRouteDAO = SqlSession.getInstance().openSession(true).getMapper(IBusLineRouteDAO.class);
	}
	
	public List<BusLine> getBusLinesByRoute(Long id){
		List<Long> busesIds = busLineRouteDAO.getBusLinesByRouteId(id);
		List<BusLine> buses = new ArrayList<BusLine>();
		busesIds.stream().forEach(rId -> buses.add(busLineDAO.getEntity(rId)));
		return buses;
	}
}
