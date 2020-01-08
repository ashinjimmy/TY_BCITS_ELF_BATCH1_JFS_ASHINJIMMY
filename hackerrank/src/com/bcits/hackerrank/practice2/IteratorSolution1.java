package com.bcits.hackerrank.practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorSolution1 {

	public static Scanner scanner = new Scanner(System.in);

	public static Iterator func(List arrList) {

		Iterator itr = arrList.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj instanceof String)
				break;
		}
		return itr;
	}

	public static void main(String[] args) {

		List arrList = new ArrayList();

		System.out.println("Enter the initial number of elements ");
		int m = scanner.nextInt();

		System.out.println("Enter the elements ");
		for (int i = 0; i < m; i++) {
			arrList.add(scanner.nextInt());
		}

		System.out.println("Enter the number of  elements ");
		int n = scanner.nextInt();
		
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			arrList.add(scanner.next());
		}

		Iterator itr = func(arrList);

		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj.toString());
		}

	}

}
