package com.jspider.task;

import java.io.File;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args) {

		File f = new File("C:\\wejm5");
		if (f.exists() == true) {
			System.out.println("folder already exists");
		} else {
			f.mkdir();
			System.out.println("folder created");
		}
		File f1 = new File("C:\\wejm5\\f2");
		if (f1.exists() == true) {
			System.out.println("folder already exists");
		} else {
			f1.mkdir();
			System.out.println("folder created");
		}
		File f3 = new File("C:\\wejm5\\f2\\f3");
		if (f3.exists() == true) {
			System.out.println("folder already exists");
		} else {
			f3.mkdir();
			System.out.println("folder created");
		}

		File file = new File("C:\\wejm5\\f2\\f3\\p.txt");
		if (file.exists() == true) {
			System.out.println("file is already exist");
		} else {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
