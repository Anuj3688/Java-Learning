package com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO.CarDTO;
import com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO.OwnerDTO;

public class CarOwnerDAO {

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

		CarDTO c1 = new CarDTO();
		c1.setName("SWIFT");
		c1.setSpeed(500);

		OwnerDTO o1 = new OwnerDTO();
		o1.setName("VIHAAN");
		o1.setAge(3);

		c1.setOwner(o1);
		o1.setCar(c1);

		manager.persist(c1);
		manager.persist(o1);

		CarDTO c2 = new CarDTO();
		c2.setName("BALENO");
		c2.setSpeed(400);

		OwnerDTO o2 = new OwnerDTO();
		o2.setName("SWAPNIL");
		o2.setAge(23);

		c2.setOwner(o2);
		o2.setCar(c2);

		manager.persist(c2);
		manager.persist(o2);

		CarDTO c3 = new CarDTO();
		c3.setName("CELERIO");
		c3.setSpeed(200);

		OwnerDTO o3 = new OwnerDTO();
		o3.setName("MAYUR");
		o3.setAge(20);

		c3.setOwner(o3);
		o3.setCar(c3);

		manager.persist(c3);
		manager.persist(o3);
		transaction.commit();

		closeConnection();
	}
}
