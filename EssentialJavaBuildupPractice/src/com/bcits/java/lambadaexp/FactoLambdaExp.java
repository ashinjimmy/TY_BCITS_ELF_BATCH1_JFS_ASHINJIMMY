package com.bcits.java.lambadaexp;

import java.util.Scanner;

interface Factorial {
	
	public int facto(int a);
}

public class FactoLambdaExp {

	public static void main(String[] args) {
		
		Factorial f1 = (a) -> {
			
			if(a == 0 ) {
				return 1;
			}
			
			int result = 1;
			for(int i = a; i >= 1; i--) {
				result = result*i;
			}
			return result;
		};
		
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input a number : ");
		int num = sc1.nextInt();
		System.out.println("The factorial of "+num+" is "+ f1.facto(num));

	}

}
