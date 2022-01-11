package com.xworkz.City.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.City.entity.CityEntity;
import com.xworkz.Company.entity.CompanyEntity;

public class CityDAOImpl implements CityDAO {

	@Override
	public void create(CityEntity entity) {
		System.out.println("invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
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
	public CityEntity getById(int id) {
		CityEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg " + id);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(CityEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(CityEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
			session.close();
		}
		return entity;

	}

	public void updateNameById(String newName, int id) {
		System.out.println("invoked updateNameById");
		System.out.println("args passed :" + newName + "" + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
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

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
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
