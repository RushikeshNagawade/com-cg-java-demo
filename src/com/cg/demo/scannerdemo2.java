package com.cg.demo;
import java.util.Scanner;
public class scannerdemo2 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer");
			
			int data1 = input.nextInt();
			System.out.println(data1);
		}
	}

}
