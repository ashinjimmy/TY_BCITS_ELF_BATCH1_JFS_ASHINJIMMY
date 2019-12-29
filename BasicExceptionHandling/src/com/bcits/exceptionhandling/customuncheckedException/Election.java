package com.bcits.exceptionhandling.customuncheckedException;

public class Election {
	
	void vote(int age) {
		if(age > 18) {
			System.out.println("Allow to vote ");
		} else {
			throw new AgeLimitException();
		}
	}
	

}
