package com.bcits.java.patterns;

import java.util.Scanner;

public class PlusPattern9 {
	
	public static void pattern(int n) {
		System.out.println("Displaying the Pattern:\n");
		int m =n/2;
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		      if ((i==m) || (j==m)) {
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

	
//	static final int max = 100; 
//
//	static void carveCross(Object str1) { 
//		String str = (String) str1;
//		int n = str.length(); 
//		if (n % 2 == 0) { 
//			
//			System.out.print("Not possible. Please enter "
//								+ "odd length string.\n"); 
//		} else { 
//
//			// declaring a 2D array i.e a matrix 
//			Object arr[][] = new Object[max][max]; 
//			int m = n / 2; 
//
//			// Now, we will fill all the 
//			// elements of the array with " " 
//			for (int i = 0; i < n; i++) { 
//				for (int j = 0; j < n; j++) { 
//					arr[i][j] = " "; 
//			} 
//		} 
//
//		for (int i = 0; i < n; i++) { 
//			
//			arr[i][m] = str.charAt(i); 
//		} 
//
//		for (int i = 0; i < n; i++) { 
//			arr[m][i] = str.charAt(i); 
//		} 
//
//		for (int i = 0; i < n; i++) { 
//			for (int j = 0; j < n; j++) { 
//				System.out.print(arr[i][j] + " "); 
//			} 
//			System.out.print("\n"); 
//		 } 
//	   } 
//	} 
//
//
//	public static void main(String[] args) { 
//		
//		Scanner sc1 = new Scanner(System.in);
//		
//		System.out.println("Enter the data to be printed");
//		Object data = sc1.next();
//		 
//		carveCross(data); 
//	}
//	


	 


