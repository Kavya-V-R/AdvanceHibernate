package com.xworkz.City;

import java.sql.SQLException;

import com.xworkz.City.dao.CityDAO;
import com.xworkz.City.dao.CityDAOImpl;
import com.xworkz.City.entity.CityEntity;

public class CityRunner {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CityDAO dao = new CityDAOImpl();
		
		//CityEntity cityEntity = new CityEntity(1, "Tumkur", 50000, "coconut", "yellow");
		//dao.create(cityEntity);
		//CityEntity cityEntity2 = new CityEntity(2, "chitradurga", 40000, "fort", "red");
		//dao.create(cityEntity2);
		
		//CityEntity entity = dao.getById(2);
		//System.out.println(entity);
		
		//dao.updateNameById("Tumakuru", 1);
		
		dao.deleteById(3);
	}
}
