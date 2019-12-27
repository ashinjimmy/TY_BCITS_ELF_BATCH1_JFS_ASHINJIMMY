package com.bcits.exceptionhandling.checked.nestedtryCatch;

public class TestC {

	public static void main(String[] args) {
		System.out.println("Program starts....");
		String name = null;
		try {
			try {
				System.out.println(name.length());
			} catch (NullPointerException np) {
				System.out.println(np.getMessage());
			}
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		System.out.println("Program ends....");

	}

}
