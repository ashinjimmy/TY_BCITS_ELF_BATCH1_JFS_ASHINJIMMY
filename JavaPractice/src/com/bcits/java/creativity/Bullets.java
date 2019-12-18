package com.bcits.java.creativity;

import java.util.Scanner;

public class Bullets {

	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Number of bullets to load the GUN");
		int bullets = sc1.nextInt();
		
		Gun g1 = new Gun(bullets);
		System.out.println(g1);

	}

}
