package com.bcits.exceptionhandling.customcheckedException;

public class SBIAtm {

	public static void main(String[] args) {
	System.out.println("Program starts.....");
	
	ATMSimulator a = new ATMSimulator();
	try {
		a.withdraw(45000);
	} catch (InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Program ends");

	}

}
