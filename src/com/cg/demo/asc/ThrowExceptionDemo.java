package com.cg.demo.asc;

import java.util.Scanner;

public class ThrowExceptionDemo {
	static void check(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("Invalid age");
		else
			System.out.println("Vote for India");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int n = sc.nextInt();
		try {
			check(n);	
		} catch(Exception m) {System.out.println("Exception handled "+m);}
		
		sc.close();
		
	}

}
