package com.cg.demo.abs;


interface CentralGovtRules {
	public abstract void payInterest();
}

interface StateGovtRules {
	int i = 20;
	public void giveLoans();
}

class RBI { // abstract class
	// Overridden
//	public abstract void doKyc(); // (what? - Yes), (How? - No) -abstract method
	public void test() {
		System.out.println("Test RBI");
	}
	
public void openAccount() { // abstract class can have concrete class
	System.out.println("Open Account...");
	
}
}

class HDFC extends RBI implements CentralGovtRules, StateGovtRules { // concrete class
	
	//@Override
	public void doKyc() {// (what? - Yes) (How? - Yes)- concrete method
		System.out.println("Aadhar");
		
	}
	public void test() {
		System.out.println("Test HDFC");
	}
	public void giveLoan() {
		System.out.println("HDFC is giving loan...");
	}
	
	public void payInterest() {
		System.out.println("HDFC is paying interest...");
	}
	@Override
	public void giveLoans() {
		// TODO Auto-generated method stub
		
	}
}


public class BankingDemo {
	
	public static void main(String[] args) {
		
		HDFC test1 = new HDFC ();
//		hdfc.doKyc();
//		hdfc.openAccount();
//		hdfc.payInterest();
//		hdfc.giveLoan();
//		
	test1.test();
	}

}
