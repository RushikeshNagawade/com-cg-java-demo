package com.cg.demo.lambda;
import java.util.ArrayList;
public class LamDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(8);
		numbers.add(56);
		numbers.add(855);
		
		for(int i : numbers) {
			System.out.println(i);
		}
//		numbers.forEach((n) -> { System.out.println(n);});
	}

}
