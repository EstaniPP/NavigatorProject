package com.solvd.NavigatorProject.services;

import java.util.List;

import com.solvd.NavigatorProject.DAO.IRailwayLineDAO;
import com.solvd.NavigatorProject.models.transport.RailwayLine;
import com.solvd.NavigatorProject.myBatis.SqlSession;

public class RailwayLineService {

	private IRailwayLineDAO railwayLineRouteDAO;
	
	public RailwayLineService() {
		railwayLineRouteDAO = SqlSession.getInstance().openSession(true).getMapper(IRailwayLineDAO.class);
	}
	
	public List<RailwayLine> getRailwayLinesByRoute(Long id){
		return railwayLineRouteDAO.getRailwayLinesByRouteId(id);
	}
}
