package com.thread.yeild;

public class JoinMethodEx {

	public static void main(String[] args) {
		Runnable r1=()->{
		  for (int i = 0; i < 20; i++) {
			System.out.println("1st thread  "+i+"  instance running");
		}	
		};
		Runnable r2=()->{
			  for (int i = 0; i < 20; i++) {
				System.out.println("2nd thread  "+i+"  instance running");
			}	
			};
			Runnable r3=()->{
				  for (int i = 0; i < 20; i++) {
					System.out.println("3rd thread  "+i+"  instance running");
				}	
				};
				
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	
	t3.start();
	}
}
