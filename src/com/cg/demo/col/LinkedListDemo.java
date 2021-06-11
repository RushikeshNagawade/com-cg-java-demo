package com.cg.demo.col;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> good = new LinkedList<String>();
		good.add("Ravi");
		good.add("Vijay");
		good.add("Ravi");
		good.add("Ajay");
		
		Iterator<String>itr = good.iterator();
		while(itr.hasNext()) {
			System.out.println();
		}
	}

}
