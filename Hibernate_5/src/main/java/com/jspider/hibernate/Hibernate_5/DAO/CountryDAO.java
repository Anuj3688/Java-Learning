package com.jspider.hibernate.Hibernate_5.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate.Hibernate_5.DTO.CountryDTO;

public class CountryDAO {

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
			System.out.println("The Trasanction is Commited");
		}
	}

	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();

		CountryDTO c1 = new CountryDTO();
		c1.setPopulation(2222);
		c1.setCountryName("INDIA");
		c1.setPrimeMinisterName("NARENDRA MODI");
		c1.setDRate(7.8);

		entityManager.persist(c1);

		entityTransaction.commit();

		closeConnection();
	}
}
