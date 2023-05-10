package com.thread.RaceCondition;

public class SyncronizedBlock {
   static String s="Hi";
   
   public static void main(String[] args) {
	Runnable r1=()->{
		
		synchronized (s) {
		   System.out.println("   Thread 1 is locked the string s   ");
		   s=s+"Java";
		   System.out.println(s);
		}
		System.out.println("   The lock is released by the Thread 1    ");
	};
	Runnable r2=()->{
	
		synchronized (s) {
			   System.out.println("    Thread 2 is locked the string s    ");
			   s=s+"Python";
			   System.out.println(s);
			}
			System.out.println("    The lock is released by the Thread 2    ");
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
}
}
