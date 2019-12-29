package com.bcits.java.patterns;

import java.util.Scanner;

public class Pattern3 {
	
	static Scanner sc1=new Scanner(System.in);
	
	public static void pattern(int n) {
		
		System.out.println("Displaying the Pattern");
		System.out.println();
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int k = 1; k < n; k++) {
//			for(int m = n-1; m >= k; m--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//     	}
//	}
	
		int m = (n/2)+1;

		for(int i = 1; i <= n; i++) {
		if(i<=m) {
		for(int k = 1; k <= i; k++) {
		System.out.print("* ");
		}
		System.out.println();
		} else {
		for(int j =1; j <=(m-1); j++) {
		System.out.print("* ");
		}
		m--;
		System.out.println();
		}
		}
		}

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the row : ");
		System.out.println();
		int n = sc1.nextInt();
		pattern(n);

	}

}
