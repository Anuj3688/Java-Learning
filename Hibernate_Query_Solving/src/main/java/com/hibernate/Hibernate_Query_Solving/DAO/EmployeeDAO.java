package com.hibernate.Hibernate_Query_Solving.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDAO {

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

//		EmployeeDTO e1 = new EmployeeDTO();
//		e1.setName("Pankaj");
//		e1.setAddress("Karad");
//		e1.setEmail("pankaj69@gmail.com");
//		e1.setSalary(30000);
//
//		EmployeeDTO e2 = new EmployeeDTO();
//		e2.setName("Sahil");
//		e2.setAddress("Baramati");
//		e2.setEmail("sahil61@gmail.com");
//		e2.setSalary(20000);
//
//		EmployeeDTO e3 = new EmployeeDTO();
//		e3.setName("Vaibhav");
//		e3.setAddress("Chakan");
//		e3.setEmail("vaibhav55@gmail.com");
//		e3.setSalary(25000);
//
//		EmployeeDTO e4 = new EmployeeDTO();
//		e4.setName("Aakash");
//		e4.setAddress("Nagar");
//		e4.setEmail("akash33@gmail.com");
//		e4.setSalary(30000);
//
//		manager.persist(e1);
//		manager.persist(e2);
//		manager.persist(e3);
//		manager.persist(e4);
//
//		transaction.commit();

		String jpql = "select name from EmployeeDTO";
		Query query = manager.createQuery(jpql);
		List resultList = query.getResultList();

		for (Object emp : resultList) {
			System.out.println(emp);
		}

		String jpql1 = "select id from EmployeeDTO";
		Query query1 = manager.createQuery(jpql1);
		List resultList1 = query.getResultList();

		for (Object emp : resultList1) {
			System.out.println(emp);
		}
		transaction.commit();

		transaction.begin();
		// UPDATE table_name SET column1 = value1 WHERE condition;

		String jpql2 = "update EmployeeDTO set email='bunty@gmail.com' where id=122";
		Query query2 = manager.createQuery(jpql2);
		int executeUpdate = query2.executeUpdate();
		System.out.println(executeUpdate + " row(s) affected");

		transaction.commit();

		transaction.begin();

		String jpql3 = "update EmployeeDTO set email='rohan@gmail.com' where id=123";
		Query query3 = manager.createQuery(jpql3);
		int executeUpdate3 = query3.executeUpdate();
		System.out.println(executeUpdate3 + " row(s) affected");

		transaction.commit();

		transaction.begin();

		String jpql4 = "delete from EmployeeDTO where salary=25000";
		Query query4 = manager.createQuery(jpql4);
		int executeUpdate4 = query4.executeUpdate();

		transaction.commit();

		closeConnection();
	}
}
