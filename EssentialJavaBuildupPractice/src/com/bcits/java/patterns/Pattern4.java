package com.bcits.java.patterns;

import java.util.Scanner;

public class Pattern4 {
	
	public static void pattern(int n) {
		System.out.println("Displaying the final Pattern Diag. ");
		for(int i = 1; i <= n; i++) {
			for(int j = n-1; j >= i; j--) {
				
				System.out.print(" ");	
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Input the size of the row :");
		int n = sc1.nextInt();
		pattern(n);
	
	}

}
