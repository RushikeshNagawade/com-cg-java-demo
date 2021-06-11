package com.cg.demo.col;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stackName = new Stack<String>();
		stackName.push("Apple");
		stackName.push("Mango");
		stackName.push("Grapes");
		stackName.push("Guava");
		
		System.out.println("Stack: " +stackName );
		String fruits = stackName.peek();
		System.out.println("Top of the stack is " +fruits+ ".  I ate it.");
		
		stackName.pop();
		System.out.println("Stack after eating:  " +stackName );
		
		Iterator<String> iteratorName = stackName.iterator();
		System.out.println("fruts left in stack are ");
		while(iteratorName.hasNext()) {
//			Object values = iteratorName.next();
//			System.out.println(values);
			
			System.out.println(iteratorName.next());
		}
	}

}
