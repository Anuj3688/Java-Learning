package com.thread.example;

public class TestThread {
   public static void main(String[] args) {
	FirstThread obj1=new FirstThread();
	obj1.start();
	
	SecondThread obj2=new SecondThread();
	obj2.start();
}
}
