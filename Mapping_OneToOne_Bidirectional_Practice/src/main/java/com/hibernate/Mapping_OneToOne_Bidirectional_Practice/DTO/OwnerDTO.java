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
@Table(name = "owner_details")
public class OwnerDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "owner_id")
	private int id;

	@Column(name = "owner_name")
	private String name;

	@Column(name = "owner_age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private CarDTO car;

}
