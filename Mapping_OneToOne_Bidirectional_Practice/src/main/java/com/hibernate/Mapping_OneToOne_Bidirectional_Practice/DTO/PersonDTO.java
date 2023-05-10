package com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person_details")
public class PersonDTO {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;

	@Column(name = "person_age")
	private int age;

	@Column(name = "address")
	private String address;

	@OneToOne(cascade = CascadeType.ALL)
	private NameDTO name;
}
