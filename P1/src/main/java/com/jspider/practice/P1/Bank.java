package com.jspider.practice.P1;

public class Bank {

	private String bankId;

	private String bankName;

	private String bankAdd;

	private String bankIFSC;

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAdd() {
		return bankAdd;
	}

	public void setBankAdd(String bankAdd) {
		this.bankAdd = bankAdd;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankAdd=" + bankAdd + ", bankIFSC=" + bankIFSC
				+ "]";
	}
}
