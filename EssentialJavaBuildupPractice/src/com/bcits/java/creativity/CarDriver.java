package com.bcits.java.creativity;

public class CarDriver {
	
	public void drive(Object car) {
		
		if( car instanceof Audi) {
			System.out.println("The driver is driving AUDI ");
		} else {
			System.out.println("The driver is driving BENZ ");
		}
	}

}
