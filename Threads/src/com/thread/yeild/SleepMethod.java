package com.thread.yeild;

public class SleepMethod {
public static void main(String[] args) {
	
	Runnable r1=()->{
		//we need to put sleep method inside the try catch block as it shows exception
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("1st Thread is Running");
		}
	};
	Runnable r2=()->{
		for (int i = 0; i < 20; i++) {
			System.out.println("2nd Thread is Running");
		}
	};
	Runnable r3=()->{
		for (int i = 0; i < 20; i++) {
			System.out.println("3rd Thread is Running");
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t1.start();
	t2.start();
	t3.start();
}
}
