package com.bcits.java.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void patternInvPyramid(int n) {
		System.out.println("Displaying the Pyramid");
		System.out.println();
		for(int i = n; i >= 1; i--) {
			for(int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the row: ");
		Scanner sc1 = new Scanner(System.in);
		 int n = sc1.nextInt();
		patternInvPyramid(n);

	}
}
