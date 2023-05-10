package com.jspider.folder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\WEJM3\\ganesh.txt";
		File file = new File(path);
		
		FileWriter fw=null;
		String content="We are learning J2EE";
		try {
			fw=new FileWriter(file);
			fw.write(content);
			fw.flush();
			System.out.println("Data Written Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
