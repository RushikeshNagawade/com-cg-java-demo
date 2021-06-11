package com.cg.demo.asc;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 8;
		int b = 0;
		
		try
		{
			int c = a / b;
			if ( b == 0)
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by 10");
		}
		
	}

}
