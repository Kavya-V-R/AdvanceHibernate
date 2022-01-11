package com.xworkz.Country.dao;

import com.xworkz.Country.entity.CountryEntity;

public interface CountryDAO {
void create(CountryEntity entity);

default CountryEntity getById(int id) {
	return null;
}
default void updateNameById(String newName,int id){
	
}
default void deleteById(int id) {
	
}
}
