package com.cg.demo.col;
import java.util.*;
public class SortedOrTreeSet {
//	Java TreeSet class contains unique elements only like HashSet.
//	Java TreeSet class access and retrieval times are quiet fast.
//	Java TreeSet class doesn't allow null element.
//	Java TreeSet class is non synchronized.
//	Java TreeSet class maintains ascending order.
// does't allow duplicate elements
	public static void main(String[] args) {
		TreeSet<String> someSet = new TreeSet<String>();
		someSet.add("Apple");
		someSet.add("Pen");
		someSet.add("Car");
		someSet.add("Zebra");
		
		System.out.println("ascending order:");
		Iterator <String> itr = someSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("descending order:");
		Iterator<String> itr1 = someSet.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println( itr1.next());
		}
	}

}
