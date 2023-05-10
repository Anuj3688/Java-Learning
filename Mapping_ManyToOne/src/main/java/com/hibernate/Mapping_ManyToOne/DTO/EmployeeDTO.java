package com.hibernate.Mapping_ManyToOne.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_data")
public class EmployeeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;

	@Column(name = "employee_name")
	private String name;

	@ManyToOne
	private CompanyDTO company;
}
