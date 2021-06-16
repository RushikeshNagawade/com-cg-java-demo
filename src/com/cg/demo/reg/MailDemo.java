package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailDemo {
	
	public static void main(String[] args) {
		
		String email = "name.surname12@gmail.com";
		String regex = "[\\D][\\w-.]+[@][\\D][\\w]+[\\.][\\D][\\w]+";
		//		[no digit][words and-.]+ means one or more [@] [no digits][words] [.][no digit][words]
		// format to compare use in pattern
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
	}

}
