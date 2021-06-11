package com.cg.demo.method;

 

public class App {

 

    public static void main(String[] args) {

 

        int num = 10;

 
//  class name/variable/ new/ constructor-method
        Employee obj = new Employee();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());
        
        Employee obj1 = new Employee();
        obj.id = 10;
        obj.name = "Abcd";
        obj.salary = 11.5;               
        System.out.println(obj1.toString());
        
        Employee obj2 = new Employee();
        obj.id = 200;
        obj.name = "xyz";
        obj.salary = 11.5;               
        System.out.println(obj2.toString());
        
        Employee obj3 = new Employee(100, "Ddd", 10.5);
        System.out.println(obj3.toString());
        
        Employee obj4 = new Employee(101, "Eee", 12.2);
        System.out.println(obj4.toString());
        
        Employee obj5 = new Employee(106, "Eee");
        System.out.println(obj5.toString());

 

    }

 

}
 