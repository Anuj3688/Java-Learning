package com.hibernate.Mapping_OneToMany.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "std")
public class StudentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_roll_number")
	private int rollNo;

	@Column(name = "student_name")
	private String name;

}
