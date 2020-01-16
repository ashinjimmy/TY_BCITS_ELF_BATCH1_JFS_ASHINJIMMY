package com.bcits.hackerrank.methodoverridingsuperkeyword;

public class SubClass extends SuperClass {
	
	public String defineMe() {
		return " a cycle with Engine ";
	}
	
	public SubClass() {
		System.out.println("Hello I am a Motor cycle I am"+defineMe());
		String temp = super.defineMe();
		System.out.println("My Ancestor is a cycle who is"+temp);
	}


}
