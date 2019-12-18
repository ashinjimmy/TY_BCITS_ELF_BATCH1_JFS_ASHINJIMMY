package com.bcits.java.creativity;

public class Car {
	
	String fuel;
	int quantity;
	
	public Car(String fuel, int quantity) {
		super();
		this.fuel = fuel;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "The car is initially fueled with " + quantity + " Liters of "+ fuel;
	}
	
	

}
