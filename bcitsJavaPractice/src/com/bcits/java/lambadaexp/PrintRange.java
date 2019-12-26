package com.bcits.java.lambadaexp;

import java.util.Scanner;

interface RangeOfNums {
	public String range(int num1, int num2);
}

public class PrintRange {

	public static void main(String[] args) {
		
		RangeOfNums rn = (n1, n2)-> {  // created  an object for the interface and given the ref. var. as rn 
			String res = "";
			for(int i = n1; i <= n2; i++) {
				res = res + i + " ";
			}
			return res;
		};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entre the starting range : ");
		int input1 = sc1.nextInt();
		System.out.println("Entre the ending range : ");
		int input2 = sc1.nextInt();
		System.out.println("Printing the range of numbers w.r.t the given range : \n\n"+ rn.range(input1, input2));
	}

}
