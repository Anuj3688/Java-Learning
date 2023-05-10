package com.jspider.garbage;

public class TestGarbage {

	public static void main(String[] args) {

		Student student = new Student("baburao", 17);
		System.out.println(student.name);
		student = null;
		System.gc();
		System.out.println(student.age);
	}

}