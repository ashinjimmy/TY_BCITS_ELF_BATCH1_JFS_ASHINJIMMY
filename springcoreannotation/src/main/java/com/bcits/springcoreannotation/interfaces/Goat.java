package com.bcits.springcoreannotation.interfaces;

public class Goat implements Animal {
	
	@Override
	public void eat() {
	
		System.out.println("Eating Grass...");
		
	}
	
	@Override
	public void speak() {
	 
		System.out.println("Making Sound Meeh!");
		
	}

}//End of class
