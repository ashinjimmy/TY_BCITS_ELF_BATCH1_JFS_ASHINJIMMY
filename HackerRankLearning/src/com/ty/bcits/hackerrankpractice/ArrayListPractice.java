package com.ty.bcits.hackerrankpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of lines..");
		int lines = sc1.nextInt();
		
		
		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>(lines);
		ArrayList<Integer> arrayList = null;
	
		
		for(int i = 1; i <= lines; i++) {
			System.out.println("Enter the number of the digits...");
			int digits = sc1.nextInt();
			arrayList = new ArrayList(digits);
			arrayList.add(0, digits);
			for(int j = 1; j <= digits; j++ ) {
			System.out.println("Enter the number of digits in "+ j +"th line");
			arrayList.add(j,sc1.nextInt());
			 }
			System.out.println(arrayList.toString());
		    arrayLists.add(arrayList);
		    }
		System.out.println(arrayLists.toString());
		
		System.out.println("Enter the number of Querie ");
		int query = sc1.nextInt();
		for(int i = 1; i <= query; i++ ) {
			System.out.println("Enter the index");
			int index = sc1.nextInt();
			System.out.println("Enter the position");
			int pos = sc1.nextInt();
			try {
			System.out.println("The extracted value is : "+arrayLists.get(index-1).get(pos-1)+"\n");
			} catch (Exception e) {
				System.err.println("Error..... Please note the arrayList size");
			}
		}

		
         sc1.close();

	}

}
