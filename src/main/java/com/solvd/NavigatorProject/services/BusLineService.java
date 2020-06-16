package com.solvd.NavigatorProject.services;

import java.util.List;

import com.solvd.NavigatorProject.DAO.IBusLineDAO;
import com.solvd.NavigatorProject.models.transport.BusLine;
import com.solvd.NavigatorProject.myBatis.SqlSession;

public class BusLineService {

	private IBusLineDAO busLineRouteDAO;
	
	public BusLineService() {
		busLineRouteDAO = SqlSession.getInstance().openSession(true).getMapper(IBusLineDAO.class);
	}
	
	public List<BusLine> getBusLinesByRoute(Long id){
		return busLineRouteDAO.getBusLinesByRouteId(id);
	}
}
