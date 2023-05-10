package com.jspider.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Ganesh\\Desktop\\emp.ser";
		File f=new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		Employee emp = new Employee("Pankaj","Pankaj123@gmail.com");
		try {
			fos =new FileOutputStream(f);
			os= new ObjectOutputStream(fos);
			os.writeObject(emp);
			System.out.println("Object is Serialized");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
