package com.cg.demo.col;
import java.util.*;
public class HashSetDemo {
//	HashSet stores the elements by using a mechanism called hashing.
//	HashSet contains unique elements only.//sets do not accept duplicate
//	HashSet allows null value.
//	HashSet class is non synchronized.
//	HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//	HashSet is the best approach for search operations.
//	The initial default capacity of HashSet is 16, and the load factor is 0.75
	
	public static void main(String[] args) {
		HashSet<String>set= new HashSet<String>();
		set.add("one");
		set.add("Two");
		set.add("1");
		set.add("112");
		set.add("#");
		
		Iterator<String> i= set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
