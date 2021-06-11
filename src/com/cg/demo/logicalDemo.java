package com.cg.demo;

public class logicalDemo {
	public static void main(String[] args) {
		int salary = 12;
		int leaves = 15;
		int expectedSalary = 10;
		int expectedleaves = 20;
		
	//	System.out.println(salary >= expectedSalary  );
	//System.out.println(leaves >= expectedleaves );
		
		System.out.println((salary >= expectedSalary) && (leaves >= expectedleaves ));
		
		System.out.println((salary >= expectedSalary ) || (leaves >= expectedleaves ));
	}

}
