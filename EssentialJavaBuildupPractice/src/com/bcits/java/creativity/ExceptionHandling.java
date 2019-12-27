package com.bcits.java.creativity;

import java.util.Scanner;

public class ExceptionHandling extends RuntimeException{
	public static int sum;
	public static int custom(int num)  {
		
		try{  int sum = 100 / num;	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc1.nextInt();
		custom(num);
		System.out.println(sum);
		
	}
	
}

