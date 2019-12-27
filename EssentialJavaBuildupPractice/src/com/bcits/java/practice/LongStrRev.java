package com.bcits.java.practice;

import java.util.Scanner;

public class LongStrRev {
	
	public static String rev(String str1) {
		
		String []words = str1.split(" ");
		String revString = "";
		
		for (int i = 0 ;i < words.length ; i++) {
			String word = words[i];
			String revWord = "";
			for(int j = word.length()-1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
				}
			     revString = revString + revWord +" ";
			}
		return revString;
	     }
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the String to reverse : \n");
		String str1 = sc1.nextLine();
		System.out.println("Displaying the reversed String : \n\n"+ rev(str1));
		
	}

}
