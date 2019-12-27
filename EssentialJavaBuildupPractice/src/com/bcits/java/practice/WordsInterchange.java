package com.bcits.java.practice;

import java.util.Scanner;

public class WordsInterchange {
	
	public static String interChangeWord(String str1) {
		String []words = str1.split(" ");
		String res = " ";
		
		for (int i = 0 ; i < words.length; i++) {
			if(i == 0) {
				res += words[words.length-1] + " ";
			} else if( i % 2 == 0) {
				res += words[i-2] + " ";			
			} else { 
				res += words[i] + " ";	
			}
			
		}
		return res;
//		return  res = res + words[4] +" "+ words[1] +" "+ words[0] +" "+ words[3] +" "+ words[2];
	 
			}
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the String value \n");
		String str = sc1.nextLine();
		System.out.println(" Displaying the string value with its length \n\n"+interChangeWord(str)); 

	}

}
