package com.xworkz.Patient;

import com.xworkz.Patient.dao.PatientDAO;
import com.xworkz.Patient.dao.PatientDAOImpl;
import com.xworkz.Patient.entity.PatientEntity;

public class PatientRunner {

	public static void main(String[] args) {
		//PatientEntity patientEntity=new PatientEntity(1,"ram",20,"Bihar","positive");
		PatientDAO dao =new PatientDAOImpl();
		//dao.create(patientEntity);
		//PatientEntity entity = dao.getById(3);
		//System.out.println(entity);
		dao.updateNameById("ram kumar", 1);
		//dao.deleteById(3);
	}

}