package com.hibernate.Mapping_OneToMany.DTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tea")
public class TeacherDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "teahcer_id")
	private int id;

	@Column(name = "teacher_name")
	private String name;

	@OneToMany
	List<StudentDTO> student;

}
