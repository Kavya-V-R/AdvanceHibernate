package com.xworkz.Country;

import com.xworkz.Country.dao.CountryDAO;
import com.xworkz.Country.dao.CountryDAOImpl;
import com.xworkz.Country.entity.CountryEntity;

public class CountryRunner {

	public static void main(String[] args) {
		CountryEntity countryEntity = new CountryEntity(1, "India", "Asia", 10000000);
		CountryDAO dao = new CountryDAOImpl();
		dao.create(countryEntity);
		//CountryEntity entity = dao.getById(3);
		//System.out.println(entity);
		//dao.updateNameById("India(Bharatha)", 1);
		dao.deleteById(3);
	}
}
