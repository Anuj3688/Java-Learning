package com.jspider.isp;

public class Driver {

	public static void main(String[] args) {

		Hp h = new Hp();
		h.scan();
		h.print();
		System.out.println();

		Canon c = new Canon();
		c.fax();
		c.print();
		System.out.println();

		Epson e = new Epson();
		e.print();
		e.fax();
		e.scan();
	}
}
