package com.cg.demo.col;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDemo {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Delete delete = new Delete();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp);
		empList.add(new Employee(10, "ad", 1));
		empList.add(new Employee(103, "Shh", 11.5));
//		empList.add("Aaa");
//		empList.add(delete);
		
		System.out.println(empList);
		
		System.out.println("Iterate using iterator");
		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
		
	}

}
