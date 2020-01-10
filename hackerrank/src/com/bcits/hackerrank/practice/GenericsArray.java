package com.bcits.hackerrank.practice;

public class GenericsArray {

	public <inputArray> void printArray(inputArray[] array) {
		System.out.println("Displaying the respective array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		
		GenericsArray genericArr = new GenericsArray();
		int[] intarr = { 1, 2, 3 };
		String[] stringarr = { "Hello", "World" };
		genericArr.printArray(intarr);
		genericArr.printArray(stringarr);
	}

}
