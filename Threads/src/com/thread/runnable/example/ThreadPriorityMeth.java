package com.thread.runnable.example;

public class ThreadPriorityMeth {
	public static void main(String[] args) {
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("1st Thread Excecuting");
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("2nd Thread Excecuting");
			}
		};
		
		Runnable r3=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("3rd Thread Excecuting");
			}
		};
		Runnable r4=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("4th Thread Excecuting");
			}
		};
		Runnable r5=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("5th Thread Excecuting");
			}
		};
		
		Runnable r6=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("6th Thread Excecuting");
			}
		};
		Runnable r7=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("7th Thread Excecuting");
			}
		};
		Runnable r8=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("8th Thread Excecuting");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		System.out.println("PRiority of 1st thread="+t1.getPriority());
		Thread t2=new Thread(r2);
		t2.start();
		System.out.println("PRiority of 2nd thread="+t2.getPriority());
		Thread t3=new Thread(r3);
		t3.start();
		System.out.println("PRiority of 3rd thread="+t3.getPriority());
		Thread t4=new Thread(r4);
		t4.start();
		System.out.println("PRiority of 4th thread="+t4.getPriority());
		Thread t5=new Thread(r5);
		t5.start();
		System.out.println("PRiority of 5th thread="+t5.getPriority());
		Thread t6=new Thread(r6);
		t6.start();
		System.out.println("PRiority of 6th thread="+t6.getPriority());
		Thread t7=new Thread(r7);
		t7.start();
		System.out.println("PRiority of 7th thread="+t7.getPriority());
		Thread t8=new Thread(r8);
		t8.start();
		t8.setPriority(10);
		System.out.println("PRiority of 8th thread="+t8.getPriority());
		System.out.println("PRiority of 1st thread="+t1.getPriority());
	}
}
