package com.bcits.java.creativity;

import java.util.Scanner;

public class Candidate {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the marks obtained out of 120 for the aptiEntrance exam");
		double marks = sc1.nextDouble();
		NextRound user = new NextRound();
		try {
			user.registeration(marks);
		} catch (CustomException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
