package com.thread.example;


public class FirstThread extends Thread  {
   @Override
public void run() {
  for (int i = 0; i < 10; i++) {
	System.out.println("First Thread Is Executing");
}
}
}
