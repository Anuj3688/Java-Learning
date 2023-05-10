package com.jspider.hibernate.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAO {

	private static EntityManagerFactory entitymanagerfactory;
	private static EntityManager entitymanager;
	private static EntityTransaction entitytransaction;

	private static void openConnection() {
		entitymanagerfactory = Persistence.createEntityManagerFactory("hibernate");

		entitymanager = entitymanagerfactory.createEntityManager();

		entitytransaction = entitymanager.getTransaction();
	}

	private static void CloseConnection() {
		entitymanagerfactory.close();
		entitymanager.close();

		try {
			entitytransaction.rollback();
		} catch (Exception e) {
			System.out.println("transaction is commited");
		}

	}

	public static void main(String[] args) {

		openConnection();
		entitytransaction.begin();

		StudentDTO dto = new StudentDTO();

		dto.setRollno(11);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("============");

		dto.setRollno(12);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("*************");

		dto.setRollno(13);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("$$$$$$$$$$$$$");

		dto.setRollno(15);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("#########");

		dto.setRollno(16);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("##6666666666#");

		dto.setRollno(17);
		dto.setName("xyz");
		dto.setEmail("xyz@gmail.com");
		dto.setPhone(1234565);
		dto.setAddress("india");

//		System.out.println("-----=========--------");

		// change the name and email

		StudentDTO find = entitymanager.find(StudentDTO.class, 11);

		System.out.println(find);
		find.setName("ABCD");

		StudentDTO finds = entitymanager.find(StudentDTO.class, 12);

		System.out.println(finds);
		finds.setName("POIUYTRE");
		finds.setAddress("canada");
		finds.setEmail("POIUYTRE_@gmail.com");

		// remove from the table

		entitymanager.remove(find);

		entitytransaction.commit();
		CloseConnection();

	}

}
