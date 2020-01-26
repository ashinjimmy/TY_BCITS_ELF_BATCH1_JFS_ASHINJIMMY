package com.bcits.usecase.projectdiscom;

import java.util.Scanner;

public class EmployeeLogin {
	public static Scanner scanner = new Scanner(System.in);

	public static int input() {
		System.out.println("\n--------------- Employee Login ---------------------------\n\n");
		System.out.print("Enter the Employee Id : ");
		int empId = Integer.parseInt(scanner.nextLine());
		if (empId == 300) {
			System.err.println("Login Successful!!");
			System.out.println("\nHello, Welcome Rajesh");
		} else if (empId == 500) {
			System.err.println("Login Successful!!");
			System.out.println("\nHello, Welcome Nagesh");
		} else {
			System.err.println("INVALID ENTRY!!!! PLEASE INPUT VALID ID");
			return input();

		}
		return empId;
	}
}
