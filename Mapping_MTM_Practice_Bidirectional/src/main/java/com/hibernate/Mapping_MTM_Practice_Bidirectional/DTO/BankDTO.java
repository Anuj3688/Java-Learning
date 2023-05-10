package com.hibernate.Mapping_MTM_Practice_Bidirectional.DTO;

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
@Table(name = "bank_infoo")
public class BankDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String ifsc;

	private String address;

	@ManyToMany(mappedBy = "bank")
	private List<CustomerDTO> customers;
}
