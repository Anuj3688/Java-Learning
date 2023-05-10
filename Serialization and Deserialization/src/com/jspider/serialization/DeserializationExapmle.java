package com.jspider.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationExapmle {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\emp.ser";
		File f=new File(path);
		FileInputStream fis=null;
		ObjectInputStream ios=null;
		
		try {
			fis=new FileInputStream(f);
			ios =new ObjectInputStream(fis);
			Employee emp= (Employee) ios.readObject();
			System.out.println(emp.name);
			System.out.println(emp.mail);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ios.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
