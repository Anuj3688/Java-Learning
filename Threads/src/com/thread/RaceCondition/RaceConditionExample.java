package com.thread.RaceCondition;

public class RaceConditionExample {
	static int x=0;
	
	public  void increament() {
		x++;
	}
	public  void decreament() {
		x--;
	}
	public  void disp() {
		System.out.println(x);
	}
   public static void main(String[] args) {
	
	RaceConditionExample r=new RaceConditionExample();
	
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
