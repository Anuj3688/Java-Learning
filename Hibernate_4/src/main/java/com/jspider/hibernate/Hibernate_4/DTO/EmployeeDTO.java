package com.jspider.hibernate.Hibernate_4.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "emp")
public class EmployeeDTO {

	@Id
	@Column(name = "Number")
	private int empNo;

	@Column(name = "Name")
	private String empName;

	@Column(name = "Phone_Number")
	private long phoneNo;

	@Column(name = "Address")
	private String address;

	@Column(name = "Salary")
	private double sal;

}
