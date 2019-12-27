package com.bcits.java.lambadaexp;

import java.util.Scanner;

interface Squarable{
	
	public int square(int num);
}

public class SquareLambda {

	public static void main(String[] args) {
		
		Squarable a1 = (a) -> {
			return a * a;
		};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enetre the a number : ");
		int num1 = sc1.nextInt();
		System.out.println("The square of "+num1+" is : "+a1.square(num1));
	}

}


