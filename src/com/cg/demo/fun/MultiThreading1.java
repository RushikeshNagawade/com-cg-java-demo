package com.cg.demo.fun;
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			System.out.println(
					"Thread " + Thread.currentThread().getId()
					+ " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
public class MultiThreading1 {
	public static void main(String[] args) {
		int n =8;
		for (int i = 0; i<n; i++) {
			MultithreadingDemo obj = new MultithreadingDemo();
			obj.start();
					
		}
	}

}
