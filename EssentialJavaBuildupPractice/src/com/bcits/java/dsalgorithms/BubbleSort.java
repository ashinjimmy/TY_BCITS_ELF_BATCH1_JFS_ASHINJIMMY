package com.bcits.java.dsalgorithms;

import java.util.Scanner;

public class BubbleSort {
	
	public static int [] bubbleSorting(int []arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(arr[j-1] > arr[j]) {
					 int temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
	
				}
			}
		}
		return arr;
	}
 
	
	public static void display(int []arr ) {
		System.out.println("Displaying the input  elemets");
		for(int i =0 ; i <arr.length;i++) {
		     System.out.print(arr[i] + " "); 
		}
		System.out.println();
	} 
	
	public static void output(int[] a) {
		System.out.println("Displaying the output elements ");
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
		
	
	

	public static void main(String[] args) { 
	int [] arr = {10,4,29,50,70,45,60,90,100,10,30,40,20,30,40};
	display(arr);
	int []output = bubbleSorting(arr);
	output(output);
	}

}
