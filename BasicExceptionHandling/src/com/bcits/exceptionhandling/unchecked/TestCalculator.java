package com.bcits.exceptionhandling.unchecked;

public class TestCalculator {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void division(int a, int b) {
		try {
			System.out.println(a/b);
			} catch(ArithmeticException a1) {
				System.out.println("Math Error...");
			}
		}
	}
	


