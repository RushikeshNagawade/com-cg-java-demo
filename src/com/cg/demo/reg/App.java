package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
	
	public static void main(String[] args) {
		
//		String str = "9876543210";
//		System.out.println("******" + str.substring(6));
		
		String str = "BCD";
		String str2 = "ABCDE";
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(str2);
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());
	}

}
