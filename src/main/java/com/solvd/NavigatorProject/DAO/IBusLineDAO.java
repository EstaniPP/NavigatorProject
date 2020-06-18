package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.transport.BusLine;

public interface IBusLineDAO extends IEntityDAO<BusLine>{

	List<BusLine> getBusLinesByRouteId(Long id);
}
