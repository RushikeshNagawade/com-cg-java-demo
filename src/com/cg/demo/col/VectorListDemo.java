package com.cg.demo.col;
import java.util.*;
public class VectorListDemo {
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(4);
		
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("elephant");
		
		System.out.println("Size is:" +vec.size());
		System.out.println("Default capacity is:" +vec.capacity());
		
		System.out.println("Vector element is:" +vec);
		
		vec.add("Deer");
		vec.add("cat");
		vec.addElement("Deer");
		System.out.println("Size after addition:" +vec.size());
		System.out.println("Capacity after addition:" +vec.capacity());
		System.out.println("Elements after addition are:" +vec);
		
		vec.add("zebra");
		vec.add("rhino");
		System.out.println("Final Size:" +vec.size());
		System.out.println("Final Capacity:" +vec.capacity());
		System.out.println("Final Elements:" +vec);
		
		System.out.println("Hash code of this vector is:" +vec.hashCode());
				
	}

}
