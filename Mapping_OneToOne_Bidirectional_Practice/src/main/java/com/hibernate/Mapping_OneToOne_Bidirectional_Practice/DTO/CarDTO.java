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
@Table(name = "car_details")
public class CarDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id")
	private int id;

	@Column(name = "car_name")
	private String name;

	@Column(name = "car_speed")
	private int speed;

	@OneToOne(cascade = CascadeType.ALL)
	private OwnerDTO owner;

}
