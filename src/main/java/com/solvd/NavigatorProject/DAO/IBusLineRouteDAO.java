package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.transport.BusLineRoute;

public interface IBusLineRouteDAO extends IEntityDAO<BusLineRoute>{

	List<Long> getBusLinesByRouteId(Long id);
	
}
