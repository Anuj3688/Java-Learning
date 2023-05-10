package com.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentsDao {

	private static EntityManagerFactory entitymanagerfactory;
	private static EntityManager entitymanager;
	private static EntityTransaction entitytransaction;

	private static void openConnection() {
		entitymanagerfactory = Persistence.createEntityManagerFactory("hibernate");

		entitymanager = entitymanagerfactory.createEntityManager();

		entitytransaction = entitymanager.getTransaction();
	}

	private static void CloseConnection() {
		entitymanagerfactory.close();
		entitymanager.close();

		try {
			entitytransaction.rollback();
		} catch (Exception e) {
			System.out.println("transaction is commited");
		}

	}

	public static void main(String[] args) {

		openConnection();
		entitytransaction.begin();

		StudentsDto dto = new StudentsDto();

		dto.setRollno(1);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

		entitytransaction.commit();
		CloseConnection();

	}

}
