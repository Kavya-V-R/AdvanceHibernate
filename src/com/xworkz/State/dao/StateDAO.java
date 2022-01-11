package com.xworkz.State.dao;

import com.xworkz.State.entity.StateEntity;

public interface StateDAO {
	void create(StateEntity entity);
	default StateEntity getById(int id) {
		return null;
	}
	default void updateNameById(String newName,int id){
		
	}
	default void deleteById(int id) {
		
	}
}
