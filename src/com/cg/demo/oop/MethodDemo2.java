package com.cg.demo.oop;
//methods- DRY -Don't Repeat yourself

public class MethodDemo2 {
	static void makeCoffee() {
		System.out.println("Steps to prepare coffee");
		System.out.println("Boil Water");
		System.out.println("Add coffee powder");
		System.out.println("Add sugar");
		System.out.println("Add milk");
		System.out.println("Serve");

	}
	public static void main(String[] args) {
		
		System.out.println("Start");
		makeCoffee();
		makeCoffee();
		makeCoffee();
		makeCoffee();
		makeCoffee();
		
		System.out.println("End");
		
		
	}
}
