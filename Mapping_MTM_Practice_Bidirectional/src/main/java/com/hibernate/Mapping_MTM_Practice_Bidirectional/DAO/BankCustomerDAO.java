package com.hibernate.Mapping_MTM_Practice_Bidirectional.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_MTM_Practice_Bidirectional.DTO.BankDTO;
import com.hibernate.Mapping_MTM_Practice_Bidirectional.DTO.CustomerDTO;

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
		b1.setIfsc("hdfc4444");
		b1.setAddress("Pune");

		BankDTO b2 = new BankDTO();
		b2.setName("AXIS");
		b2.setIfsc("axis5555");
		b2.setAddress("Nigdi");

		BankDTO b3 = new BankDTO();
		b3.setName("SBI");
		b3.setIfsc("sbi6666");
		b3.setAddress("Wakad");

		CustomerDTO c1 = new CustomerDTO();
		c1.setName("Pankaj");
		c1.setPhoneNumber(6666666666L);
		c1.setAddress("KARAD");

		CustomerDTO c2 = new CustomerDTO();
		c2.setName("Sahil");
		c2.setPhoneNumber(7777766666L);
		c2.setAddress("BARAMATI");

		CustomerDTO c3 = new CustomerDTO();
		c3.setName("Vaibhav");
		c3.setPhoneNumber(8888866666L);
		c3.setAddress("NAGAR");

		List<CustomerDTO> customers = Arrays.asList(c1, c2, c3);
		List<BankDTO> bank = Arrays.asList(b1, b2, b3);

		c1.setBank(bank);
		c2.setBank(bank);
		c3.setBank(bank);

		b1.setCustomers(customers);
		b2.setCustomers(customers);
		b3.setCustomers(customers);

		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);

		transaction.commit();

		closeConnection();
	}
}
