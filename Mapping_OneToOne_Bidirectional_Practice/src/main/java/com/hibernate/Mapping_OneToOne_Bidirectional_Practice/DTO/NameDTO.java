package com.hibernate.Mapping_OneToOne_Bidirectional_Practice.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "name_details")
public class NameDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private PersonDTO person;
}
