package com.ty.bcits.hackerrankpractice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSoluton1 {
	
	 static Scanner scanner = new Scanner(System.in);
	 static List<Integer> list = null;

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the list ");
		int n = Integer.parseInt(scanner.nextLine());
		
		list = new ArrayList<Integer>(n);
		for(int i = 1; i <= n ; i++ ) {
			System.out.println("Enter the value at "+ i +"th index");
			list.add((i-1),Integer.parseInt(scanner.nextLine()));
			}
		
		System.out.println("Displaying the List"+ list.toString()+" \n");
		System.out.println("Enter the numer of Queries");
		int q = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= q; i++) {
			System.out.println("Query number : " + i+"\n");
			System.out.println("Query type Insert/Delete\n");
			String query = scanner.nextLine();
			
			if(query.equalsIgnoreCase("insert")) {
				System.out.println("Enter the Index value of the List");
				int x = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter the value for the Insertion..");
				int y = Integer.parseInt(scanner.nextLine());
				list.add(x, y);
				n++;
				
			} else if(query.equalsIgnoreCase("DELETE")) {
				System.out.println("Enter the Index value for the Deletion..");
				int x = Integer.parseInt(scanner.nextLine());
				list.remove(x);
				n--;
				
			} else {
			        System.err.println("Enter Valid Query\n");
			}
		}
		
		System.out.println(list.toString());
	}

}
