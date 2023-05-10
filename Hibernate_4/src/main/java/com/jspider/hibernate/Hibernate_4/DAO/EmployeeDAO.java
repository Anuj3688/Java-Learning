package com.jspider.hibernate.Hibernate_4.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate.Hibernate_4.DTO.EmployeeDTO;

public class EmployeeDAO {

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

		EmployeeDTO e1 = new EmployeeDTO();
		e1.setEmpNo(1111);
		e1.setEmpName("Bunty");
		e1.setPhoneNo(8888888888L);
		e1.setAddress("PCMC");
		e1.setSal(63000);

		entityManager.persist(e1);

		EmployeeDTO e2 = new EmployeeDTO();
		e2.setEmpNo(2222);
		e2.setEmpName("Gunty");
		e2.setPhoneNo(999999999L);
		e2.setAddress("PCMC");
		e2.setSal(63000);

		entityManager.persist(e2);

		EmployeeDTO e3 = new EmployeeDTO();
		e3.setEmpNo(3333);
		e3.setEmpName("Aunty");
		e3.setPhoneNo(777777777L);
		e3.setAddress("PCMC");
		e3.setSal(63000);

		entityManager.persist(e1);

		entityTransaction.commit();
		closeConnection();
	}
}
