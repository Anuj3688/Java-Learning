package com.jspider.lsp;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {

		Bird b1 = new Parrot();
		Bird b2 = new Sparrow();
		Bird b3 = new Ostrich();

		ArrayList<Bird> obj = new ArrayList();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);

		for (int i = 0; i < obj.size(); i++) {
			obj.get(i).fly();
		}
	}

}
