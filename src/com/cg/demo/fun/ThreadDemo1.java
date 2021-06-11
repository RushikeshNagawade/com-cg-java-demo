package com.cg.demo.fun;

public class ThreadDemo1 extends Thread { 
	public static void main(String[] args) {
		ThreadDemo1 obj1 = new ThreadDemo1();
		
		System.out.println("thread = " + obj1);
		obj1.start();
	}
	public void run() {
		ThreadDemo1 obj2 = new ThreadDemo1();
		System.out.println("Name = " + obj2.getName());
		
	}

}
