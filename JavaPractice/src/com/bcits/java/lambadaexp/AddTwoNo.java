package com.bcits.java.lambadaexp;

import java.util.Scanner;

interface Addable {
	public  int add1(int a, int b);
}

public class AddTwoNo {

	public static void main(String[] args) {
		
		Addable a1 = (a,b) -> {
			return a + b;
		};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enetre the first number :");
		int num1 = sc1.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc1.nextInt();
		System.out.println("The sum of "+num1+" and "+num2+" is :"+a1.add1(num1, num2));
	}

}
