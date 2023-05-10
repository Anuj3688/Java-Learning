package com.jspider.hibernate.Hibernate_5.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "country")
public class CountryDTO {

	@Id
	@Column(name = "Populn")
	private long population;

	@Column(name = "Name")
	private String countryName;

	@Column(name = "PM Name")
	private String primeMinisterName;

	@Column(name = "Devlopement Rate")
	private double dRate;
}
