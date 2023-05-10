package com.jspider.serialization_and_deserialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\student.ser";
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		Student s = new Student("Ganesh Dhore","9552170757","Rajgurunagar");
		try {
			fos=new FileOutputStream(f);
			os=new ObjectOutputStream(fos);
			os.writeObject(s);
			System.out.println("Object get Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
