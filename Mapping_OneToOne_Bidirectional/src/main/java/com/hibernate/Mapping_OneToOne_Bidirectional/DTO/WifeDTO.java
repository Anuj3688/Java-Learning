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
@Table(name = "wife_details")
public class WifeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wife_id")
	private int id;

	@Column(name = "wife_name")
	private String name;

	@Column(name = "wife_age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private HusbandDTO husband;
}
