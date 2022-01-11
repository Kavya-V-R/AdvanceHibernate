package com.xworkz.Patient.dao;

import com.xworkz.Patient.entity.PatientEntity;

public interface PatientDAO {
	void create(PatientEntity entity);
	
	default PatientEntity getById(int id) {
		return null;
	}
	default void updateNameById(String newName,int id){
		
	}
	default void deleteById(int id) {
		
	}
}