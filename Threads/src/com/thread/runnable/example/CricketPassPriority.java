package com.thread.runnable.example;

import java.util.Scanner;


public class CricketPassPriority {
	
public static void main(String[] args) {
	 String pass;
	 String vip="vip";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Your Pass Type: ");
    pass=in.nextLine();
	
	Runnable r1=()->{
		for (int i = 0; i < 10; i++) {
			System.out.println("Normal Pass Executing");
		}
	};
	
	Runnable r2=()->{
		for (int i = 0; i < 10; i++) {
			System.out.println("VIP Pass Excecuting");
		}
	};
  
	if (pass.equalsIgnoreCase(vip)) {
		Thread t2=new Thread(r2);
		t2.start();
		t2.setPriority(10);
	}else {
	Thread t1=new Thread(r1);
	t1.start();
	}
	
}
}
