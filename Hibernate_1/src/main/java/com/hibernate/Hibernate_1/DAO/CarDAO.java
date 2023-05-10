package com.hibernate.Hibernate_1.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate_1.DTO.CarDTO;

public class CarDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private static void closeConnection() {
		entityManagerFactory.close();
		entityManager.close();
		try {
			entityTransaction.rollback();
		} catch (Exception e) {
			System.out.println("The Trasaction is Commited");
		}
	}

	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();

		CarDTO c1 = new CarDTO();
		c1.setCarNo(5555);
		c1.setCarName("SWIFT");
		c1.setCarModel("TOP MODEL");
		c1.setCarSpeed(350);

		CarDTO c2 = new CarDTO();

		c2.setCarNo(6666);
		c2.setCarName("VERNA");
		c2.setCarModel("TOP MODEL");
		c2.setCarSpeed(400);

		entityManager.persist(c1);
		entityManager.persist(c2);

		entityTransaction.commit();

		closeConnection();
	}
}
