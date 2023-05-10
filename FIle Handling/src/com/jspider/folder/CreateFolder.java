package com.jspider.folder;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Ganesh\\Desktop\\WEJM3");
		if (f.exists()==true) {
			System.out.println("Folder Already Exists");
			
		} else {
			// create folder
			f.mkdir();
			System.out.println("Folder Created");
		}
	}
}
