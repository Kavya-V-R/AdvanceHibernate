package com.xworkz.Country;

import com.xworkz.Country.dao.CountryDAO;
import com.xworkz.Country.dao.CountryDAOImpl;
import com.xworkz.Country.entity.CountryEntity;

public class CountryRunner {

	public static void main(String[] args) {
		CountryDAO dao = new CountryDAOImpl();

		CountryEntity countryEntity = new CountryEntity(1, "India", "Asia", 10000000);
		dao.create(countryEntity);
		CountryEntity countryEntity2 = new CountryEntity(2, "China", "Asia", 10000000);
		dao.create(countryEntity2);

		// CountryEntity entity = dao.getById(3);
		// System.out.println(entity);

		//dao.updateNameById("India(Bharatha)", 1);

		// dao.deleteById(3);
	}
}
