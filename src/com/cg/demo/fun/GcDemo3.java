package com.cg.demo.fun;

public class GcDemo3 {
	public static void main(String[] args) {
		
		GcDemo3 obj1 = new GcDemo3();
		GcDemo3 obj2 = new GcDemo3();
		obj1 = obj2;
		System.gc();
		
	}
	public void finalize() throws Throwable {
		System.out.println("Garbage collection");
	}

}
