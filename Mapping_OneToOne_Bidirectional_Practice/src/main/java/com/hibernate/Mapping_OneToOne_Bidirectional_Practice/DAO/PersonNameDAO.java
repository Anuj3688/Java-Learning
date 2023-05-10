package com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO.NameDTO;
import com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO.PersonDTO;

public class PersonNameDAO {
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

		NameDTO n1 = new NameDTO();
		n1.setAge(20);
		n1.setName("GANESH");

		PersonDTO p1 = new PersonDTO();
		p1.setAge(22);
		p1.setAddress("PUNE");

		p1.setName(n1);
		n1.setPerson(p1);

		manager.persist(p1);
		manager.persist(n1);

		transaction.commit();

		closeConnection();
	}
}
