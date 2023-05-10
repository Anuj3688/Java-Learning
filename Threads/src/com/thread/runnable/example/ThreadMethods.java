package com.thread.runnable.example;

public class ThreadMethods {
	public static void main(String[] args) {
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("First Thread Excecuting");
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Second Thread Excecuting");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();
		System.out.println("Default Name Of 1st Thread="+t1.getName());
		System.out.println("ID Of 1st Thread="+t1.getId());
		t1.setName("Brum..thread");
		System.out.println("Updated Name Of 1st Thread="+t1.getName());
		
		System.out.println("Default Name Of 2nd Thread="+t2.getName());
		System.out.println("ID Of 2nd Thread="+t2.getId());
		t2.setName("PAvillion");
		System.out.println("Updated Name Of 2nd Thread="+t2.getName());
		
	}
}
