package com.bcits.exceptionhandling.customunUncheckedException;

public class TestD {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Person p = new Person();
		try {
			p.clone();
			System.out.println("Person is cloned");
		} catch (CloneNotSupportedException e) {
		
			e.getMessage();
		}
		System.out.println("Program ends");


	}

}
