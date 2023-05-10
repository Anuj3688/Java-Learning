package com.hibernate.Hibernate_Mapping.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "emp")
public class EmpDTO {
	@Id
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_email")
	private String empEmail;

	@Column(name = "emp_contact")
	private long empPhoneNumber;

	@Column(name = "emp_address")
	private String empAddress;

	@OneToOne
	private EmpDTO manager;
}
