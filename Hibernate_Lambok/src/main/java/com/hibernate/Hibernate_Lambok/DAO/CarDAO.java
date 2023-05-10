package com.hibernate.Hibernate_Lambok.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate_Lambok.DTO.CarDTO;

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
			System.out.println("Transaction is Commited");
		}
	}

	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();

		CarDTO c1 = new CarDTO();
		c1.setCarNo(201);
		c1.setCarName("AUDI");
		c1.setCarModel("TOP");
		c1.setCarSpeed(500);
		entityManager.persist(c1);

		CarDTO c2 = new CarDTO();
		c2.setCarNo(202);
		c2.setCarName("SWIFT");
		c2.setCarModel("TOP");
		c2.setCarSpeed(00);
		entityManager.persist(c2);

		CarDTO c3 = new CarDTO();
		c3.setCarNo(203);
		c3.setCarName("BALENO");
		c3.setCarModel("SEMI");
		c3.setCarSpeed(200);
		entityManager.persist(c3);

		CarDTO c4 = new CarDTO();
		c4.setCarNo(204);
		c4.setCarName("BMW");
		c4.setCarModel("TOP");
		c4.setCarSpeed(600);
		entityManager.persist(c4);

		CarDTO c5 = new CarDTO();
		c5.setCarNo(205);
		c5.setCarName("AUDI_Q7");
		c5.setCarModel("TOP");
		c5.setCarSpeed(550);
		entityManager.persist(c5);

		CarDTO find = entityManager.find(CarDTO.class, 202);
		find.setCarSpeed(200);
		find.setCarModel("SEMI");
		entityManager.remove(find);

		CarDTO find1 = entityManager.find(CarDTO.class, 204);
		find.setCarSpeed(206);
		find.setCarModel("TOP");
		entityManager.remove(find1);

		entityTransaction.commit();
		closeConnection();
	}
}
