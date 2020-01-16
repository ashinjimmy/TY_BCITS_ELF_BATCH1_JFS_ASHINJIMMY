package com.bcits.hackerrank.methodoverriding;

public class MainClass extends Subclass {
	
	public static void main(String[] args) {
		
		System.out.println("Displaying  method overriding example\n ");
		
		SuperClass superClass = new SuperClass();
		superClass.method1();
		
		Subclass subclass = new Subclass();
		subclass.method1();
	}

}
