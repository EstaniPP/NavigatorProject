package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.location.Route;

public interface IRouteDAO extends IEntityDAO<Route> {

	List<Route> getRoutesByStartStationId(Long id);

}
