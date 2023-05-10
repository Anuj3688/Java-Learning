package com.jspider.isp;

public class Canon implements Fax, Print {

	public void print() {
		System.out.println("Canon provide printing");
	}

	public void fax() {
		System.out.println("Canon provide fax");
	}

}
