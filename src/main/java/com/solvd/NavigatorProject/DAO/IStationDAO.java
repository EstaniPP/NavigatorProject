package com.solvd.NavigatorProject.DAO;

import org.apache.ibatis.annotations.Param;

import com.solvd.NavigatorProject.models.location.Station;

public interface IStationDAO extends IEntityDAO<Station> {

	Station getStationByCoordinate(@Param("latitude") Integer latitude,@Param("longitude") Integer longitude);
}
