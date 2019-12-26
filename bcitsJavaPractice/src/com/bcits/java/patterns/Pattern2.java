/*
 
* * * *
* * *
* *
*

**/

package com.bcits.java.patterns;

import java.util.Scanner;

public class Pattern2 {

	public static Scanner sc1 = new Scanner(System.in);
	
	public static void pattern(int n) {
		
		System.out.println("Displaying the final Pattern diagram");
		System.out.println();
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Input the size of the row :");
		System.out.println();
		int n = sc1.nextInt();
		pattern(n);

	}

}
