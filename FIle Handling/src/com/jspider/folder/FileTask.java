package com.jspider.folder;

import java.io.File;
import java.io.IOException;

public class FileTask {
	
	
public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Ganesh\\Desktop\\File Handling\\File\\Task");
		if (f.exists()==true) {
			System.out.println("Folder Already Exists");
			
		} else {
			// create folder
			f.mkdir();
			System.out.println("Folder Created");
		}
		
		File f1 = new File("C:\\Users\\Ganesh\\Desktop\\File Handling\\File\\Task\\file.txt");
		if (f1.exists()==true) {
			System.out.println("File is already exists");
		} else {
			// create a new File
			try {
			f1.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("File Created Successfully");
		}
	}
}
