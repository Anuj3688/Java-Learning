package com.jspider.singleTon;

public class StudentDemo {

	private static StudentDemo studentDemo;

	static int count;

	private StudentDemo() {
		System.out.println("Object is Created " + count + " Times");
	}

	public static StudentDemo getObject() {
		if (studentDemo == null) {
			count++;
			studentDemo = new StudentDemo();
			System.out.println("Object created succesfully");
			return studentDemo;
		}
		System.out.println("Already Created");
		return studentDemo;
	}
}
