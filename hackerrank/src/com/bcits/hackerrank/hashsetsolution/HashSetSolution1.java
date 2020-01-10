package com.bcits.hackerrank.hashsetsolution;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetSolution1 {

	public static Scanner scanner = new Scanner(System.in);
	public static HashSet hash = null;

	public static void main(String[] args) {
		System.out.println("Enter the number of pairs");
		int num = Integer.parseInt(scanner.nextLine());
		hash = new HashSet(num);

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the first\n");
			String fname = scanner.nextLine();
			System.out.println("Enter the second ");
			String lname = scanner.nextLine();
			hash.add(fname + " " + lname);
			System.out.println("number of pairs that are unique in set " + hash.size());
		}
		System.out.println(hash.toString());
	}

}
