package com.hibernate.Hibernate_Lambok.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class CarDTO {

	@Id
	@Column(name = "Number")
	private int carNo;

	@Column(name = "Name")
	private String carName;

	@Column(name = "Speed")
	private int carSpeed;

	@Column(name = "Model")
	private String carModel;
}
