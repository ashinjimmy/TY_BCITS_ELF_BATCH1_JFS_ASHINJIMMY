package com.bcits.java.creativity;

import java.util.Scanner;

public class Gift {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Choose a Gift, you want to presnt to your friend! \n");
		String Bdgift = sc1.nextLine();
		
		Friend frnd = new Friend(Bdgift);
		System.out.println(frnd);
	
	}

}
