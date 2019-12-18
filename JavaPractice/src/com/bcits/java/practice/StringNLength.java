package com.bcits.java.practice;

import java.util.Scanner;

public class StringNLength {
	
	
	public static String countWord(String str1) {
	String []words = str1.split(" ");
	String resString =  " ";
	for(int i = 0; i < words.length; i++) {
		String word = words[i];
		String resWord = " ";
		for(int j = 0; j < word.length(); j++) {
			resWord = resWord + word.charAt(j);
		}
		resString = resString + resWord + (resWord.length()-1); 
	  }
	return resString;
		
  }

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the String value \n");
		String str = sc1.nextLine();
		System.out.println(" Displaying the string value with its length \n\n"+countWord(str)); 

	}

}
