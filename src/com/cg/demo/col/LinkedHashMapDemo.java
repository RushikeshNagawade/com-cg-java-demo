package com.cg.demo.col;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
//		Maintains insertion order
// 		key cannot be duplicate
// 		duplicate value will be replaced		
		LinkedHashMap<Integer, String> nameMap = new LinkedHashMap<Integer, String>();
		nameMap.put(5, "dog");
		nameMap.put(100, "Cat");
		nameMap.put(5, "zebra");
		nameMap.put(1100, "apple");
		
//		System.out.println("Keys:" +nameMap.keySet());
//		System.out.println("values:" + nameMap.values());
		System.out.println("Key - value pairs:" +nameMap.entrySet());
	}

}
