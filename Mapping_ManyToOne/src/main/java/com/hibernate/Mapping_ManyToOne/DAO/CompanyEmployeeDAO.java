package com.hibernate.Mapping_ManyToOne.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_ManyToOne.DTO.CompanyDTO;
import com.hibernate.Mapping_ManyToOne.DTO.EmployeeDTO;

public class CompanyEmployeeDAO {

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

		CompanyDTO c = new CompanyDTO();
		c.setName("TCS");

		EmployeeDTO e1 = new EmployeeDTO();
		e1.setName("Sahil");
		e1.setCompany(c);

		EmployeeDTO e2 = new EmployeeDTO();
		e2.setName("Pankaj");
		e2.setCompany(c);

		manager.persist(c);
		manager.persist(e1);
		manager.persist(e2);

		transaction.commit();
		closeConnection();
	}
}