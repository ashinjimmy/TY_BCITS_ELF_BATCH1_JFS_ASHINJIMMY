package com.bcits.java.practice;

import java.util.Scanner;

public class StringRev {
	
	public static String rev(String str1) {
		String revStr = " ";
		for (int i = str1.length()-1; i >=0 ; i--) {
			revStr = revStr + str1.charAt(i);	
		}
		return revStr;
	}
	

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the String to reverse : ");
		System.out.println();
		String str1 = sc1.nextLine();
		String res = rev(str1);
		System.out.println();
		System.out.println("Displaying the reversed String is : ");
		System.out.println();
		System.out.println(res);
	}

}
