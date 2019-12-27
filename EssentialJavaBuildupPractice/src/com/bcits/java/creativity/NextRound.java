package com.bcits.java.creativity;

public class NextRound {
	public void registeration(double marks) throws CustomException {
		if(marks >= 90) {
			System.out.println("You are eligible for the next round!\n");
			System.out.println("The date and time will be informed shortly. Thank you\n");
		} else {
			throw new CustomException("BetterLuckNextTime!");
		}
	}

}
