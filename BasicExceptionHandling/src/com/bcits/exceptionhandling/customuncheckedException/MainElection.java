package com.bcits.exceptionhandling.customuncheckedException;

public class MainElection {

	public static void main(String[] args) {
		Election e1 = new Election();
		System.out.println("Program starts...");
		try{
			e1.vote(12);
		}catch(AgeLimitException a) {
			System.out.println(a.getMessage());
		}
		System.out.println("Program ends...");
	}



}


