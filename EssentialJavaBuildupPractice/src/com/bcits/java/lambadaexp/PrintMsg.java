package com.bcits.java.lambadaexp;

import java.util.Scanner;

interface PrintInfo {
	public String data(String info);
}

public class PrintMsg {

	public static void main(String[] args) {
		
		PrintInfo pi = (String info)-> {
			return info;	
		};
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enetre the data to be printed : ");
		String input = sc1.nextLine();
		System.out.println("Printing the given information as it is \n\n"+ pi.data(input));

	}

}
