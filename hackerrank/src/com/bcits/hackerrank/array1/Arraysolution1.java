package com.bcits.hackerrank.array1;

import java.util.Scanner;

public class Arraysolution1 {

	public static Scanner scanner = new Scanner(System.in);

	public static int[] input(int m) {
		int[] arr = new int[m];
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < m; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public static int[] display(int[] arr) {
		System.out.println("\nDisplaying the Array elements\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		int m = scanner.nextInt();
		int[] arr = input(m);
	    display(arr);
	    scanner.close();
	}
}
