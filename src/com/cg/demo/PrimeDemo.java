package com.cg.demo;

import java.util.Scanner;
public class PrimeDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		System.out.println("List of prime numbers up to");
		PrimeDemo obj = new PrimeDemo();
		
		int primeNumberCount = obj.getListOfPrimeNumbers(num);
		System.out.println("Total Prime Numbers are " + primeNumberCount);
	}
		
		public int getListOfPrimeNumbers(int num) {
			int primeNumberCount = 0;
			for (int i = 2; i <=num; i++) {
				boolean isPrime = true;
				for (int j = 2; j<i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i);
					primeNumberCount++;
				}
			}
		
			return primeNumberCount;
	}

}
