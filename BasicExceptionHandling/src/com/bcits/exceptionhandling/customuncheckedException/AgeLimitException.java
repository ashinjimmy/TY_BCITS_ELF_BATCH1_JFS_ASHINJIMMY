package com.bcits.exceptionhandling.customuncheckedException;

public class AgeLimitException extends RuntimeException {
	String message = "The age is below 18";
	public AgeLimitException() {
		
	}
	
	public AgeLimitException(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return message;
	}

}
