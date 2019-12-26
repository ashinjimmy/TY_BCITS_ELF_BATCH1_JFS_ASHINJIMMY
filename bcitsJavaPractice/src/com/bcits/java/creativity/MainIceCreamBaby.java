package com.bcits.java.creativity;

import java.util.Scanner;

public class MainIceCreamBaby {

	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("What flavoured Ice-cream would you like to pass to the Baby!?");
		
		Icecream ref = new Icecream(sc1.nextLine());
		Baby b = new Baby(ref);
        System.out.println(b);
		 
//		 System.out.println("whom do you want to gift..");
//		 String name= sc1.nextLine();
//		 System.out.println("which gift u want to present..");
//		 
//		 Gift g1 = new Gift(sc1.nextLine());
//		 Friend friend1 = new Friend(g1,name);
//		 
//		 System.out.println(friend1);
	}

	}


