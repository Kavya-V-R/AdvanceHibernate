package com.xworkz.City.dao;

import com.xworkz.City.entity.CityEntity;


public interface CityDAO {
	void create(CityEntity entity);
	
	default CityEntity getById(int id) {
		return null;
	}
	default void updateNameById(String newName,int id){
		
	}
	default void deleteById(int id) {
		
	}
}
