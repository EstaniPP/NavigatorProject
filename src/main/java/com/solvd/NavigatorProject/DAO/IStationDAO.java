package com.solvd.NavigatorProject.DAO;

import java.util.List;

import com.solvd.NavigatorProject.models.location.Station;

public interface IStationDAO extends IEntityDAO<Station> {

	List<Station> getEndStationsByStartStationId(Long id);
}
