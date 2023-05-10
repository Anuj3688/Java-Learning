package com.hibernate.Mapping_ManyToOne_Practice.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_ManyToOne_Practice.DTO.BankDTO;
import com.hibernate.Mapping_ManyToOne_Practice.DTO.CustomerDTO;

public class BankCustomerDAO {

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

		BankDTO b = new BankDTO();
		b.setName("HDFC");

		CustomerDTO c1 = new CustomerDTO();
		c1.setName("Pankaj");
		c1.setBank(b);

		CustomerDTO c2 = new CustomerDTO();
		c2.setName("Sahil");
		c2.setBank(b);

		CustomerDTO c3 = new CustomerDTO();
		c3.setName("Vaibhav");
		c3.setBank(b);

		manager.persist(b);
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);

		transaction.commit();

		closeConnection();

	}
}
