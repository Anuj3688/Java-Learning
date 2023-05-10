package com.jspider.hibernate.New;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAO {

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
			System.out.println("The Transaction is Commited");
		}
	}

	public static void main(String[] args) {

		openConnection();

		entityTransaction.begin();

		StudentDTO dto = new StudentDTO();
		dto.setRollNo(1);
		dto.setName("ABC");
		dto.setEmailId("abc@gmail.com");
		dto.setPhoneNo(1231231231);
		dto.setAddress("pune");

		entityManager.persist(dto);
		entityTransaction.commit();
		closeConnection();
	}
}
