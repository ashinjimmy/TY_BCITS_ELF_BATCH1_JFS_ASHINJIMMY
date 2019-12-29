package com.bcits.exceptionhandling.customcheckedException;

import javax.naming.InsufficientResourcesException;

public class ATMSimulator {
	
	int balance =40000;
	void withdraw(int amount) throws InsufficientBalanceException {
		if(amount <= balance) {
			System.out.println("Withdrawed Successfully");
		} else {
			throw new InsufficientBalanceException();
		}
	}

}
