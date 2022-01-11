package com.xworkz.State;

import java.sql.SQLException;

import com.xworkz.State.dao.StateDAO;
import com.xworkz.State.dao.StateDAOImpl;
import com.xworkz.State.entity.StateEntity;

public class StateRunner {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		StateEntity cityEntity = new StateEntity(1, "Karnataka", 30, "Bengaluru");
		StateDAO dao = new StateDAOImpl();
		dao.create(cityEntity);
		//StateEntity entity = dao.getById(3);
		//System.out.println(entity);
		//dao.updateNameById("Karnataka1", 1);
		dao.deleteById(3);
	}
}
