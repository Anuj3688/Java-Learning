package com.jspider.hibernate.Hibernate_3.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate.Hibernate_3.DTO.BankDTO;

public class BankDAO {

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

		BankDTO b1 = new BankDTO();
		b1.setBankId(102);
		b1.setBankName("HDFC1");
		b1.setBankIFSC("HDFC1_IFSC0014");
		b1.setAddress("PUNE1");

		entityManager.persist(b1);

		BankDTO find = entityManager.find(BankDTO.class, 101);
		find.setBankIFSC("IFSC002");
		entityTransaction.commit();

		closeConnection();
	}
}
