package com.bcits.exceptionhandling.exceptionpropogation;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		try {
			A.a();
		} catch(ArithmeticException a) {
			System.out.println(a.getMessage());

		}
		System.out.println("Program ends ");

	}

}
