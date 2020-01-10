package com.bcits.hackerrank.arraysolution2;

import java.util.Scanner;

public class ArraySoultion {

	public static Scanner scanner = new Scanner(System.in);

	public static int[][] input(int rows, int columns) {
		System.out.println("Enter the "+rows+" x "+columns+" elements");
		int[][] array = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextInt();
			}

		}
		return array;
	}

	public static int display(int[][] arr, int m, int n) {
		int max_val = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + 2 < m) && (j + 2) < n) {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

					if (sum > max_val) {
						sum = max_val;
					}
				}

			}

		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println("Enter the number of rows for the 2D array");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns for the 2D array");
		int n = scanner.nextInt();
		int[][] input = input(m, n);
		int sum = display(input, m, n);
		System.out.println("The total sum is : " + sum);
		scanner.close();

	}

}
