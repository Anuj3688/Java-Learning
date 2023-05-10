package com.jspider.folder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {

		String path = "C:\\Users\\Ganesh\\Desktop\\WEJM3\\ganesh.txt";
		File f = new File(path);
		FileWriter fw = null;

		try {
			fw = new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fw.write("Welcome TO Advance Java");
			fw.flush();
			System.out.println("Data Write Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
