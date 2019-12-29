package com.bcits.java.creativity;

import java.util.Scanner;

public class Icecream1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("What Ice-cream would you like to buy for the baby");
		String flavour = sc1.nextLine();
		
		Baby1 b = new Baby1(flavour);
		System.out.println(b); // When we print an object reference, toString() automatically invoked 

	}

}
