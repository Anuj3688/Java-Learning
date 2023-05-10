package com.jspider.singleTon;

public class Practice {

	public static void main(String[] args) {

		Integer obj = 100;
		int i = obj.intValue();
		System.out.println(obj);
		System.out.println(i);

		Long obj1 = 10000L;
		long i1 = obj1.longValue();
		System.out.println(obj1);
		System.out.println(i1);

		Float obj2 = (float) 0.0;
		float i2 = obj2.floatValue();
		System.out.println(obj2);
		System.out.println(i2);
	}
}
