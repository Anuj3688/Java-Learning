package com.jspider.folder;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Ganesh\\Desktop\\WEJM3\\ganesh.txt");
		if (f.exists()==true) {
			System.out.println(" File is already exists");
		} else {
			// create a new File
			try {
			f.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(" File Created ");
		}
	}
}
