package com.xworkz.City;

import java.sql.SQLException;

import com.xworkz.City.dao.CityDAO;
import com.xworkz.City.dao.CityDAOImpl;
import com.xworkz.City.entity.CityEntity;

public class CityRunner {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CityEntity cityEntity = new CityEntity(1, "Tumkur", 50000, "coconut", "yellow");

		CityDAO dao = new CityDAOImpl();
		dao.create(cityEntity);
		//CityEntity entity = dao.getById(3);
		//System.out.println(entity);
		//dao.updateNameById("Tumakuru", 1);
		dao.deleteById(3);
	}
}
