package com.solvd.NavigatorProject.DAO;

import com.solvd.NavigatorProject.models.location.Station;

public interface IStationDAO extends IEntityDAO<Station> {

	Station getStationByCoordinate(Double latitude, Double longitude);
}
