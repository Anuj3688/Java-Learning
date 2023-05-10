package com.jspider.hibernate.Hibernate_3.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDTO {

	@Id
	private int bankId;
	private String bankName;
	private String bankIFSC;
	private String address;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BankDTO [bankId=" + bankId + ", bankName=" + bankName + ", bankIFSC=" + bankIFSC + ", address="
				+ address + "]";
	}

}
