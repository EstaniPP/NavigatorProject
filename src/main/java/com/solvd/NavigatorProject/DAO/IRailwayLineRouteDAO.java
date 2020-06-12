package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.transport.RailwayLineRoute;

public interface IRailwayLineRouteDAO extends IEntityDAO<RailwayLineRoute> {

	List<Long> getRailwayLinesByRouteId(Long id);
	
}
