package com.solvd.NavigatorProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.NavigatorProject.DAO.ICityDAO;
import com.solvd.NavigatorProject.DAO.IUserDAO;
import com.solvd.NavigatorProject.models.location.City;
import com.solvd.NavigatorProject.models.location.Station;
import com.solvd.NavigatorProject.models.user.User;
import com.solvd.NavigatorProject.myBatis.SqlSession;
import com.solvd.NavigatorProject.navigationSolution.Navigator;
import com.solvd.NavigatorProject.services.StationService;

public class Runner {
	
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {
//		ICityDAO cityDao = SqlSession.getInstance().openSession(true).getMapper(ICityDAO.class);
//		
//		City city = new City();
//		city.setName("Tandil");
//		cityDao.save(city);
//		city.setName("Azul");
//		cityDao.save(city);
//		
//		cityDao.getEntities().stream().forEach(c -> LOGGER.info(c.getName()));
//		
//		IUserDAO userDao = SqlSession.getInstance().openSession(true).getMapper(IUserDAO.class);
//		
//		User user = new User();
//		user.setName("Juan");
//		user.setLastName("Perez");
//		user.setBirthDate(LocalDate.of(2020, 4, 20));
//		user.setAddress("address");
//		userDao.save(user);
//		user.setName("Jose");
//		user.setLastName("Pacual");
//		user.setBirthDate(LocalDate.of(2010, 4, 20));
//		user.setAddress("address");
//		userDao.save(user);
//		
//		userDao.getEntities().stream().forEach(c -> LOGGER.info(c.getName()));
		
		StationService stationService = new StationService();
//		
//		stationService.findStations(Integer.toUnsignedLong(1)).stream().forEach(st -> LOGGER.info(st.getName()));;

		Station start = stationService.getStationById(Integer.toUnsignedLong(2));
		Station end = stationService.getStationById(Integer.toUnsignedLong(6));
		
		Navigator nav = new Navigator();
		
		List<Station> actualPath = new ArrayList<Station>();
		
		nav.getPath(start, end, actualPath);
		
		actualPath.stream().forEach(st -> LOGGER.info(st.getName()));
		LOGGER.info(actualPath.size());
	}

}
