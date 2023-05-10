package com.hibernate.Hibernate_Mapping.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate_Mapping.DTO.EmpDTO;

public class EmpDAO {

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

		EmpDTO e1 = new EmpDTO();
		e1.setEmpId(11);
		e1.setEmpName("Bunty");
		e1.setEmpEmail("bunty@gmail.com");
		e1.setEmpPhoneNumber(9552170757L);
		e1.setEmpAddress("PUNE");

		manager.persist(e1);

		EmpDTO e2 = new EmpDTO();
		e2.setEmpId(12);
		e2.setEmpName("Anuj");
		e2.setEmpEmail("anuj@gmail.com");
		e2.setEmpPhoneNumber(9552100757L);
		e2.setEmpAddress("PCMC");
		e2.setManager(e1);

		manager.persist(e2);

		EmpDTO e3 = new EmpDTO();
		e3.setEmpId(13);
		e3.setEmpName("Ram");
		e3.setEmpEmail("ram@gmail.com");
		e3.setEmpPhoneNumber(9002122757L);
		e3.setEmpAddress("WAKAD");
		e3.setManager(e1);

		manager.persist(e3);

		transaction.commit();

		closeConnection();
	}
}
