package com.cg.demo.col;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> set1 = new HashMap<String,Integer>();
		set1.put("Apple",1);
		set1.put("Cat", 3);
		set1.put("Bat", 2);
		set1.put("Dog", 4);
		System.out.println("Iterating Hashmap");
		for(Map.Entry m: set1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
