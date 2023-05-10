package com.hibernate.Hibernate_1.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate_1.DTO.CarDTO;

public class CarUpdate {

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
		c1.setCarNo(3232);
		c1.setCarName("SWIFT");
		c1.setCarModel("TOP MODEL");
		c1.setCarSpeed(350);

		c1.setCarNo(5656);
		c1.setCarName("VERNA");
		c1.setCarModel("TOP MODEL");
		c1.setCarSpeed(400);

		entityManager.persist(c1);
		entityTransaction.commit();

		CarDTO find = entityManager.find(CarDTO.class, 1215);
		System.out.println(find);
		find.setCarName("LUNA");
		find.setCarModel("BASE MODEL");
		find.setCarSpeed(50);

		entityManager.remove(find); // remove method removes the table data which we are update after insertion

		closeConnection();
	}
}
