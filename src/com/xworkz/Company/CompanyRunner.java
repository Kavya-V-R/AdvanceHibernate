package com.xworkz.Company;

import java.sql.SQLException;

import com.xworkz.Company.dao.CompanyDAO;
import com.xworkz.Company.dao.CompanyDAOImpl;
import com.xworkz.Company.entity.CompanyEntity;

public class CompanyRunner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CompanyDAO dao = new CompanyDAOImpl();
		
		//CompanyEntity companyEntity = new CompanyEntity(1, "xworkz", "IT", "MNC", "www.abc");
		//CompanyEntity companyEntity2 = new CompanyEntity(2, "yworkz", "IT", "MNC", "www.def");
		//dao.create(companyEntity);
		//dao.create(companyEntity2);
		//CompanyEntity companyEntity3 = new CompanyEntity(3, "zworkz", "IT", "MNC", "www.ghi");
		//dao.create(companyEntity3);
		//CompanyEntity entity = 
		//dao.getById(3);
		//System.out.println(entity);
		//dao.updateNameById("xworkz-odc", 1);
		dao.deleteById(3);
	}

}