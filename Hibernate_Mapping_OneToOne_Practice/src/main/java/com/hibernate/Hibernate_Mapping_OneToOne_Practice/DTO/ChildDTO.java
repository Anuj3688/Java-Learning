package com.hibernate.Hibernate_Mapping_OneToOne_Practice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "child_details")
public class ChildDTO {

	@Id
	@Column(name = "child_name")
	private String name;

	@Column(name = "child_age")
	private int age;
}
