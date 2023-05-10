package com.hibernate.Mapping_OneToMany_Practice.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_OneToMany_Practice.DTO.BankDTO;
import com.hibernate.Mapping_OneToMany_Practice.DTO.CustomerDTO;

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

		CustomerDTO c1 = new CustomerDTO();
		c1.setName("Pankaj");

		CustomerDTO c2 = new CustomerDTO();
		c2.setName("Sahil");

		CustomerDTO c3 = new CustomerDTO();
		c3.setName("Vaibhav");

		BankDTO b = new BankDTO();
		b.setName("HDFC");

		List<CustomerDTO> customer = Arrays.asList(c1, c2, c3);
		b.setCustomer(customer);

		manager.persist(b);
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);

		transaction.commit();

		closeConnection();

	}
}
