package com.jspider.singleton;

public class DemoClass {

	private static DemoClass demoClass;

	static int count;

	private DemoClass() {
		System.out.println("Object Created " + count + " times");
	}

	public static DemoClass getObject() {
		if (demoClass == null) {
			count++;
			demoClass = new DemoClass();
			System.out.println("Object Creation method");
			return demoClass;
		}
		System.out.println("Object creation method");
		return demoClass;
	}
}
