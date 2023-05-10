package com.jspider.SRP;

public class BookStore {

	String Bid;
	String Bname;
	String Aname;
	int qty;
	int price;

	public BookStore(String bid, String bname, String aname, int qty, int price) {
		super();
		this.Bid = bid;
		this.Bname = bname;
		this.Aname = aname;
		this.qty = qty;
		this.price = price;
	}

	public void printInvoice() {
		System.out.println("------------------------------------------");
		System.out.println(" Book ID              : " + this.Bid);
		System.out.println(" Book Name            : " + this.Bname);
		System.out.println(" Author Name          : " + this.Aname);
		System.out.println(" Qty of Book          : " + this.qty);
		System.out.println(" Price of one book    : " + this.price);
	}

	public void GetPrice() {
		if (qty >= 1) {
			if (qty > 10) {
				qty = qty * (this.price - this.price / 10);
				System.out.println(" Price (10% Discount) : " + qty);
			} else {
				qty = qty * this.price;
				System.out.println(" Price                : " + qty);

			}
		}
	}

	public static void main(String[] args) {

		BookStore b1 = new BookStore("101", "J2EE", "Hemendra Sir", 50, 1200);
		b1.printInvoice();
		b1.GetPrice();

		BookStore b2 = new BookStore("102", "J2SE", "Darshan Sir", 9, 2000);
		b2.printInvoice();
		b2.GetPrice();

		BookStore b3 = new BookStore("103", "SQL", "Suraj Sir", 40, 800);
		b3.printInvoice();
		b3.GetPrice();

		BookStore b4 = new BookStore("104", "WEB-TECH", "Hemendra Sir", 100, 5000);
		b4.printInvoice();
		b4.GetPrice();

	}

}
