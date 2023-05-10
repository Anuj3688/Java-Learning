package com.thread.runnable.example;

public class TestRunnable {
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
}
}
