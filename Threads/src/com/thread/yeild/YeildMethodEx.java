package com.thread.yeild;

public class YeildMethodEx {
  public static void main(String[] args) {
	Runnable r1=()->{
		
		for (int i = 0; i < 50; i++) {
			System.out.println("1st thread executing");
		}
	};
	Runnable r2=()->{
		for (int i = 0; i < 50; i++) {
			System.out.println("2nd thread executing");
		}
	};
	Runnable r3=()->{
		Thread.yield();
		for (int i = 0; i < 50; i++) {
			System.out.println("3rd thread executing");
		}
	};
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t2.setPriority(10);
	t1.start();
	t2.start();
	t3.start();
}
}
