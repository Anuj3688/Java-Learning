package com.thread.RaceCondition;
//used to come up with the difficulty of race condition
public class SyncronizedEx {

static int x=0;
	
	public synchronized void increament() {
		x++;
	}
	public synchronized void decreament() {
		x--;
	}
	public synchronized void disp() {
		System.out.println(x);
	}
   public static void main(String[] args) {
	
	   SyncronizedEx r=new SyncronizedEx();
	
	Runnable r1=()->{
		r.increament();
		r.disp();
	};
	Runnable r2=()->{
		r.decreament();
		r.disp();
	};
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
   }
}
