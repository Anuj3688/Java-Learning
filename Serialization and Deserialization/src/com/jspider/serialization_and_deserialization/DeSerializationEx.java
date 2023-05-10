package com.jspider.serialization_and_deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\student.ser";
		File f = new File(path);
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			Student s=(Student) ois.readObject();
			System.out.println(s.name);
			System.out.println(s.number);
			System.out.println(s.location);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
