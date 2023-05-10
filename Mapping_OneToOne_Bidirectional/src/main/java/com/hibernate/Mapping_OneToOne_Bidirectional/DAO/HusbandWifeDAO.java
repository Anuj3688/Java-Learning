package com.hibernate.Mapping_OneToOne_Bidirectional.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_OneToOne_Bidirectional.DTO.HusbandDTO;
import com.hibernate.Mapping_OneToOne_Bidirectional.DTO.WifeDTO;

public class HusbandWifeDAO {

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

		HusbandDTO husband1 = new HusbandDTO();
		husband1.setName("Dyaneshwar");
		husband1.setAge(23);

		WifeDTO wife1 = new WifeDTO();
		wife1.setName("Snehal");
		wife1.setAge(22);

		husband1.setWife(wife1);
		wife1.setHusband(husband1);

		HusbandDTO husband2 = new HusbandDTO();
		husband2.setName("Ravindra");
		husband2.setAge(23);

		WifeDTO wife2 = new WifeDTO();
		wife2.setName("Yogita");
		wife2.setAge(22);

		husband2.setWife(wife2);
		wife2.setHusband(husband2);

		manager.persist(wife1);
		manager.persist(husband1);

		manager.persist(wife2);
		manager.persist(husband2);

		transaction.commit();

		closeConnection();
	}
}
