package com.bcits.exceptionhandling.customcheckedException;

public class InsufficientBalanceException extends Exception {
	String msg = " Insufficient balance";

	public InsufficientBalanceException () {
		super();
	}

	public InsufficientBalanceException (String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		
		return this.msg;
	}
	

}
