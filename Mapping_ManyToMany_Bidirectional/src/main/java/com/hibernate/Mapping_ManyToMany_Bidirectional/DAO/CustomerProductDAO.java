package com.hibernate.Mapping_ManyToMany_Bidirectional.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Mapping_ManyToMany_Bidirectional.DTO.CustomerDTO;
import com.hibernate.Mapping_ManyToMany_Bidirectional.DTO.ProductDTO;

public class CustomerProductDAO {

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

		ProductDTO p1 = new ProductDTO();
		p1.setName("LIFE BOY");
		p1.setPrice(35);
		p1.setQty(10);

		ProductDTO p2 = new ProductDTO();
		p2.setName("DOVE");
		p2.setPrice(50);
		p2.setQty(15);

		ProductDTO p3 = new ProductDTO();
		p3.setName("PEARS");
		p3.setPrice(80);
		p3.setQty(20);

		CustomerDTO c1 = new CustomerDTO();
		c1.setName("Pankaj");
		c1.setPhoneNumber(9876543210L);
		c1.setAddress("BHUMKAR CHOWK");

		CustomerDTO c2 = new CustomerDTO();
		c2.setName("SAHIL");
		c2.setPhoneNumber(9888543210L);
		c2.setAddress("LAXMI CHOWK");

		CustomerDTO c3 = new CustomerDTO();
		c3.setName("Vaibhav");
		c3.setPhoneNumber(9555543210L);
		c3.setAddress("Dange CHOWK");

		List<CustomerDTO> customers = Arrays.asList(c1, c2, c3);
		List<ProductDTO> products = Arrays.asList(p1, p2, p3);

		c1.setProducts(products);
		c2.setProducts(products);
		c3.setProducts(products);

		p1.setCustomers(customers);
		p2.setCustomers(customers);
		p3.setCustomers(customers);

		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);

		transaction.commit();

		closeConnection();
	}
}
