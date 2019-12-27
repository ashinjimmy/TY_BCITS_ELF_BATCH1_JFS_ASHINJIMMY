package com.bcits.java.patterns;

import java.util.Scanner;

public class CrossPattern10 {
	
	public static void pattern(int n) {
		System.out.println("Displaying the Pattern:\n");
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		      if ((j==i) || (j==n-1-i)){
		      System.out.print("* ");


		} else {
		System.out.print("  ");
		}
	}
		System.out.println();
		}
	}

		public static void main(String[] args) {

		System.out.println("Enter the size of the row: ");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		pattern(n);

		}
}

	
//	public static Scanner sc1 = new Scanner(System.in);
//	
//	public static void crossP(Object str1) {
//		
//		String str = (String) str1;
//		
//		int len = str.length();
//		
//		for (int i = 0; i < len; i++) {
//			int j = len-1-i;
//			for (int k = 0; k < len; k++) {
//				if (k == i || k == j) {
//					System.out.print(str.charAt(k));
//				} else {
//					System.out.print(" ");
//				}	
//			}
//			System.out.println();
//		}
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		System.out.println("Input the data for the pattern :");
//		System.out.println();
//		Object str = sc1.next();
//		System.out.println();
//		System.out.println("Displaying the cross pattern!!");
//		System.out.println();
//		crossP(str);
//	
//	}


