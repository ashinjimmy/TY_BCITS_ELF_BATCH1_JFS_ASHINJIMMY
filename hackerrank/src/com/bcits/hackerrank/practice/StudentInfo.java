package com.bcits.hackerrank.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num = Integer.parseInt(scanner.nextLine());
		ArrayList<Data> l1 = new ArrayList<Data>();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the Student Id");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the Student name");
			String name = scanner.nextLine();
			System.out.println("Enter the CGPA");
			double cgpa = Double.parseDouble(scanner.nextLine());

			l1.add(new Data(id,name,cgpa));

		}

		Collections.sort(l1, new ComparatorSort());
		for (Data data : l1) {
			System.out.println(data);

		}

		scanner.close();


	}

}


