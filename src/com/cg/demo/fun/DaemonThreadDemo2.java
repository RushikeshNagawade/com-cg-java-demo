package com.cg.demo.fun;

public class DaemonThreadDemo2 extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		DaemonThreadDemo2 t1 = new DaemonThreadDemo2();
		t1.start();
//		Illegal Thread State Exception
		t1.setDaemon(true);
				
	}
	

}
