package com.bcits.exceptionhandling.checkedException;

public class Calculator {
	
	String name;
	void division(int a, int b) {
		try {
			Class.forName("Person");
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not found!");
		}
	}

}
