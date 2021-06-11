package com.cg.demo.method;

public class App2 {
	
	public static void main(String[] args) {
		
		Product obj = new Product();
		
		Product obj1 = new Product(20, "lead", 2.5);
		System.out.println(obj1.toString());
		
		Product obj2 = new Product(10, "tin", 1.2);
		System.out.println(obj2.toString());
		
		Product obj3 = new Product(30, "can", 0.7);
		System.out.println(obj3.toString());
		
		Product obj4 = new Product(50, "car");
		System.out.println(obj4.toString());
		
	}

}
