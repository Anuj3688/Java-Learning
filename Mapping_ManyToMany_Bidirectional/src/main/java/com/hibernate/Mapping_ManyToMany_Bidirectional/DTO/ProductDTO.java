package com.hibernate.Mapping_ManyToMany_Bidirectional.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "prod_data")
public class ProductDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private double price;

	private int qty;

	@ManyToMany(mappedBy = "products")
	List<CustomerDTO> customers;
}