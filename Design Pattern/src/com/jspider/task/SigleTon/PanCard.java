package com.jspider.task.SigleTon;

public class PanCard {

	private static PanCard pc;

	static int count;

	private PanCard() {
		System.out.println("PAN Number Generated " + count + " times");
	}

	public static PanCard getObject() {
		if (pc == null) {
			count++;
			pc = new PanCard();
			System.out.println("Object Creation method");
			return pc;
		}
		System.out.println("Object creation method");
		return pc;
	}
}
