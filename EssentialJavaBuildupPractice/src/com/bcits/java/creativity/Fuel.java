package com.bcits.java.creativity;

import java.util.Scanner;

public class Fuel {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Type of fuel required for the car ");
		String fuel = sc1.nextLine();
		System.out.println("Initial Quantity of the fuel : ");
		int quant = sc1.nextInt();
		
		Car f1 = new Car(fuel,quant);
		System.out.println(f1);

	}

}
