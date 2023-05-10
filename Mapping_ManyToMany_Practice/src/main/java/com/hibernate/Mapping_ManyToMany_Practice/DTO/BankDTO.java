package com.hibernate.Mapping_ManyToMany_Practice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bank_information")
public class BankDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bank_id")
	private int id;

	@Column(name = "bank_name")
	private String name;

	@Column(name = "bank_ifsc_code")
	private String ifsc;

	@Column(name = "bank_address")
	private String address;
}
