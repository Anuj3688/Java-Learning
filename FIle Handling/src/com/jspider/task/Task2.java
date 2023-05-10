package com.jspider.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		File file = new File("C:\\wejm5\\f2\\f3\\p.txt");
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("write anything");
		String content = sc.next();

		try {
			fw = new FileWriter(file);
			fw.write(content);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader fr = null;
		long length = file.length();
		char c[] = new char[(int) length];
		try {
			fr = new FileReader(file);
			fr.read(c);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}