package com.hibernate.Mapping_OneToMany.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_OneToMany.DTO.StudentDTO;
import com.hibernate.Mapping_OneToMany.DTO.TeacherDTO;

public class TeacherStudentDAO {
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

		StudentDTO s1 = new StudentDTO();
		s1.setName("Radhika");

		StudentDTO s2 = new StudentDTO();
		s2.setName("Pradeep");

		TeacherDTO t1 = new TeacherDTO();
		t1.setName("ABC");

		// VERY VERY IMPORTANT
		List<StudentDTO> students = Arrays.asList(s1, s2);
		t1.setStudent(students);

		manager.persist(s1);
		manager.persist(s2);
		manager.persist(t1);

		transaction.commit();
		closeConnection();
	}
}
