package com.ty.bcits.hackerrankpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSolution1 {

	public static Scanner scanner = new Scanner(System.in);
	public static Map<String, Long> map = null;

	public static void main(String[] args) {

		System.out.println("enter the number of entries");
		int entry = Integer.parseInt(scanner.nextLine());
		map = new HashMap<String, Long>(entry);

		System.out.println("Enter the details into the Phone Directory\n");
		for (int i = 1; i <= entry; i++) {
			System.out.println("Enter the name of the person");
			String name = scanner.nextLine();
			System.out.println("Enter the mobile number of the person");
			long phoneno = Long.parseLong(scanner.nextLine());
			map.put(name, phoneno);
		}

		System.out.println("The Phonebook details " + map.toString());

		System.out.println("Enter the number of Queries");
		int q = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= q; i++) {
			System.out.println("Enter the name for searching......");
			String name = scanner.nextLine();

			if (map.get(name) != null) {
				System.out.println(name + " = " + map.get(name));
			} else {
				System.out.println("Invalid Entry");
			}

		}
		scanner.close();

	}

}
