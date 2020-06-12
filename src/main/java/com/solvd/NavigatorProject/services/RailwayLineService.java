package com.solvd.NavigatorProject.services;

import java.util.ArrayList;
import java.util.List;

import com.solvd.NavigatorProject.DAO.IRailwayLineDAO;
import com.solvd.NavigatorProject.DAO.IRailwayLineRouteDAO;
import com.solvd.NavigatorProject.models.transport.RailwayLine;
import com.solvd.NavigatorProject.myBatis.SqlSession;

public class RailwayLineService {

	IRailwayLineDAO railwayLineDAO;
	IRailwayLineRouteDAO railwayLineRouteDAO;
	
	public RailwayLineService() {
		railwayLineDAO = SqlSession.getInstance().openSession(true).getMapper(IRailwayLineDAO.class);
		railwayLineRouteDAO = SqlSession.getInstance().openSession(true).getMapper(IRailwayLineRouteDAO.class);
	}
	
	public List<RailwayLine> getRailwayLinesByRoute(Long id){
		List<Long> railwaysIds = railwayLineRouteDAO.getRailwayLinesByRouteId(id);
		List<RailwayLine> railways = new ArrayList<RailwayLine>();
		railwaysIds.stream().forEach(rId -> railways.add(railwayLineDAO.getEntity(rId)));
		return railways;
	}
}
