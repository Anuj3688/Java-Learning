package com.hibernate.Hibernate_Mapping_OneToOne.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate_Mapping_OneToOne.DTO.ChildDTO;
import com.hibernate.Hibernate_Mapping_OneToOne.DTO.FatherDTO;

public class FatherDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		factory.close();
		manager.close();
		try {
			transaction.rollback();
		} catch (Exception e) {
			System.out.println("Transaction is Commited");
		}
	}

	public static void main(String[] args) {
		openConnection();
		transaction.begin();

		ChildDTO c1 = new ChildDTO();
		c1.setName("abc");
		c1.setAge(24);

		FatherDTO f1 = new FatherDTO();
		f1.setName("xyz");
		f1.setAge(50);
		f1.setChild(c1);

		manager.persist(c1);
		manager.persist(f1);

		transaction.commit();
		closeConnection();
	}
}
