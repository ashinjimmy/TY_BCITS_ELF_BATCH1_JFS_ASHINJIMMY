/*
Input the String value 

HOGA BEDA HUDUGI NANA BITTU

Displaying the string value with its length 

AGOH BEDA  IGUDUH NANA  UTTIB  */

package com.bcits.java.practice;

import java.util.Scanner;

public class HalfWordRev {
	
	
	public static String halfWordRev(String str1) {
		
		String []str = str1.split(" ");
		String res =" ";
		for (int i = 0; i < str.length; i++) {
			String words = str[i]; 
			String revStr = "";
			if(i % 2 == 0) {
				for(int j = words.length()-1; j >= 0; j--) {
					revStr += words.charAt(j);
				}
				res += revStr + " ";
			
			} else {
				res += str[i] + " ";	
			}
			
		}
		return res;	
	}

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the String value \n");
		String str = sc1.nextLine();
		System.out.println("Displaying the string value with its length \n\n"+halfWordRev(str));
		

	}

}
