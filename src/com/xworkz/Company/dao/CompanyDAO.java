package com.xworkz.Company.dao;

import com.xworkz.Company.entity.CompanyEntity;

public interface CompanyDAO {
	
	void create(CompanyEntity entity);
	
	default CompanyEntity getById(int id) {
		return null;
	}
	default void updateNameById(String newName,int id){
		
	}
	default void deleteById(int id) {
		
	}
	
}