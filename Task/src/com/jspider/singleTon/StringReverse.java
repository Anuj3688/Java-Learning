package com.jspider.singleTon;

public class StringReverse {

	public static void main(String[] args) {

		String s = "abc";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Original String : " + s);
		System.out.println();
		System.out.println("Reverse String : " + rev);
	}
}
