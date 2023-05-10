package com.jspider.SpringCoreDependencyAssignment.Main.Main;

import lombok.Data;

@Data
public class BankDetails {

	private int id;

	private String name;

	private String ifsc;

	private double turnOver;

	private long totalCustomers;
}
