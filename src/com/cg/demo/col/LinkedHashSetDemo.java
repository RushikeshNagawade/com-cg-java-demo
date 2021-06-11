package com.cg.demo.col;
import java.util.*;
public class LinkedHashSetDemo { 
//// Java LinkedHashSet class contains unique elements only like HashSet.
//	Java LinkedHashSet class provides all optional set operation and permits null elements.
//	Java LinkedHashSet class is non synchronized.
//	Java LinkedHashSet class maintains insertion order.
	
	public static void main(String[] args) {
		LinkedHashSet<String>someSet= new LinkedHashSet<String>();
		someSet.add("one");
		someSet.add("Two");
		someSet.add("1");
		someSet.add("112");
		someSet.add("#");
		
		Iterator<String> i= someSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
