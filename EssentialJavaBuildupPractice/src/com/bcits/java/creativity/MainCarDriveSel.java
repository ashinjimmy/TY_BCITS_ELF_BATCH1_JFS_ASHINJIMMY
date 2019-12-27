package com.bcits.java.creativity;

import java.util.Scanner;

public class MainCarDriveSel {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Choose the Car from the option given below \n"
				                                                          +  " Audi\n " 
				                                                          +  "Benz ");
		String carName = sc1.nextLine(); 
			
			CarDriver cd1 = new CarDriver();
			if(carName == "Audi" ) {
				
				cd1.drive(new Audi());
			
			} else {
				
				cd1.drive(new Benz());
			}
		
		}

	}

