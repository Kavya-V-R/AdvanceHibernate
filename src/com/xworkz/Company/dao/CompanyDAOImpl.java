package com.xworkz.Company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("Invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
			session.close();

		}
		factory.close();
	}

	public CompanyEntity getById(int id) {
		CompanyEntity companyentity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg " + id);
		SessionFactory factory =new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
 .buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			companyentity = session.get(CompanyEntity.class, id);
			if (companyentity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		
		}
		return companyentity;

	}

	public void updateNameById(String newName, int id) {
		System.out.println("invoked updateNameById");
		System.out.println("args passed :" + newName + "" + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) {
				entity.setName(newName);
				session.update(entity);
				transaction.commit();

				System.out.println("entity name updated");

			} else {
				System.out.println("entity is found to update name");
			}
			session.close();
		}
		factory.close();

	}

	public void deleteById(int id) {
		System.out.println("invoked the delete");
		System.out.println(id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) {
				entity.setId(id);
				session.delete(entity);
				transaction.commit();

				System.out.println("entity deleted");

			} else {
				System.out.println("entity is not found to delete");
			}
			session.close();
		}
		factory.close();

	}
}
