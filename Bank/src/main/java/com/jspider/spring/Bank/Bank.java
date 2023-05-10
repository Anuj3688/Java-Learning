package com.jspider.spring.Bank;

public class Bank {

	private String bankName;
	private int no_of_customer;
	private String ifsc;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getNo_of_customer() {
		return no_of_customer;
	}

	public void setNo_of_customer(int no_of_customer) {
		this.no_of_customer = no_of_customer;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "Bank \n [bankName=" + bankName + ",\n no_of_customer=" + no_of_customer + ",\n ifsc=" + ifsc + "]";
	}

}
