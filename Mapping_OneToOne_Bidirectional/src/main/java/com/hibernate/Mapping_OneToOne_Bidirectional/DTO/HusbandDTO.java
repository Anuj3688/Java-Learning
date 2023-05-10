package com.hibernate.Mapping_OneToOne_Bidirectional.DTO;

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
@Table(name = "husband_details")
public class HusbandDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "husband_id")
	private int id;

	@Column(name = "husband_name")
	private String name;

	@Column(name = "husband_age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private WifeDTO wife;
}
