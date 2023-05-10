package com.hibernate.Mapping_ManyToMany_Practice.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_ManyToMany_Practice.DTO.BankDTO;
import com.hibernate.Mapping_ManyToMany_Practice.DTO.CustomerDTO;

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

		BankDTO b1 = new BankDTO();
		b1.setName("HDFC");
		b1.setIfsc("HDFC0011");
		b1.setAddress("NIGDI");

		BankDTO b2 = new BankDTO();
		b2.setName("SBI");
		b2.setIfsc("SBI0022");
		b2.setAddress("AKURDI");

		BankDTO b3 = new BankDTO();
		b1.setName("PNB");
		b1.setIfsc("PNB0033");
		b1.setAddress("PIMPRI");

		CustomerDTO c1 = new CustomerDTO();
		c1.setName("Pankaj");
		c1.setPhoneNumber(9999999999L);
		c1.setAddress("WAKAD");

		CustomerDTO c2 = new CustomerDTO();
		c2.setName("Sahil");
		c2.setPhoneNumber(8888888888L);
		c2.setAddress("HINJEWADI");

		CustomerDTO c3 = new CustomerDTO();
		c3.setName("Vaibhav");
		c3.setPhoneNumber(7777777777L);
		c3.setAddress("NAGAR");

		List<BankDTO> bank = Arrays.asList(b1, b2, b3);
		c1.setBank(bank);
		c2.setBank(bank);
		c3.setBank(bank);

		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);

		transaction.commit();

		closeConnection();
	}
}
