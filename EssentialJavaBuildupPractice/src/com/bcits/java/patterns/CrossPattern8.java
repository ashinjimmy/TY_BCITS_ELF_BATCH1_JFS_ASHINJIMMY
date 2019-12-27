package com.bcits.java.patterns;

import java.util.Scanner;

public class CrossPattern8 {
	
	public static void crossPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 3 || j == 3  ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Input the size of the row: ");
		 Scanner sc1 = new Scanner(System.in);
		 int n = sc1.nextInt();
		 crossPattern(n);
	}

}
