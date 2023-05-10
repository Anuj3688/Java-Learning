package com.jspider.folder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\WEJM3\\ganesh.txt";
		File file = new File(path);
		FileReader fr=null;
		long length=file.length();
//		creating array for which we can store the data of the file
		char c[]=new char[(int) length];
		try {
			fr=new FileReader(file);
			fr.read(c);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
