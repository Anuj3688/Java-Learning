package com.hibernate.Mapping_ManyToMany_Practice.DTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer_information")
public class CustomerDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int id;

	@Column(name = "customer_name")
	private String name;

	@Column(name = "customer_contact")
	private long phoneNumber;

	@Column(name = "customer_address")
	private String address;

	@ManyToMany
	private List<BankDTO> bank;
}
