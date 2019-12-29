package com.bcits.exceptionhandling.unchecked.tryCatch;

public class TestB {

	public static void main(String[] args) {

		String name =null;
		System.out.println("Program started...");
		try {
			System.out.println(name.length());
			System.out.println(10/0);

			//		} catch(ArithmeticException ae) {
			//			System.out.println(ae.getMessage());
			//		} catch(NullPointerException npe) {
			//			System.out.println(npe.getMessage());
		} catch(ArithmeticException | NullPointerException a) {
			System.out.println(a.getMessage());
		}
		System.out.println("Program ended...");
	}

}


