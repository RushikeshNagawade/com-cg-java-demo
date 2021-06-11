package com.cg.demo.fun;

public class DaemonThreadDemo1 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread");
		} else { 
			System.out.println("non-daemon thread");
		}
	}
public static void main(String[] args) {
	DaemonThreadDemo1 t1 = new DaemonThreadDemo1();
	DaemonThreadDemo1 t2 = new DaemonThreadDemo1();
	t1.setDaemon(true);
	t1.start();
	t2.start();
}
}
