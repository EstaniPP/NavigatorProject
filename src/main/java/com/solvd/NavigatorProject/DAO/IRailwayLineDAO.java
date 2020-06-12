package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.transport.RailwayLine;

public interface IRailwayLineDAO extends IEntityDAO<RailwayLine>{

	List<RailwayLine> getRailwayLinesByRouteId(Long id);
}
