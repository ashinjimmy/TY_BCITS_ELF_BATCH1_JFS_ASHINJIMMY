package com.bcits.hackerrank.comparatorsolutio;

import java.util.Arrays;
import java.util.Scanner;

public class ComparatorSolution1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Players..");
		int num = Integer.parseInt(scanner.nextLine());

		Player[] arr = new Player[num];
		for (int i = 0; i < num; i++) {
			//System.out.println("Enter the " + i + "th Player name and score!");
			System.out.println("Enter the name of "+i+"th Player");
			String name = scanner.nextLine();
			System.out.println("Enter the score of the "+i+"th Player");
			int score = Integer.parseInt(scanner.nextLine());
			
			arr[i] = new Player(name ,score);
		}
		Arrays.sort(arr, new PlayerSort());
		System.out.println("Displaying the player's name according to the sorted scores");
		for (Object obj : arr) {
			System.out.println(obj);
		}

		scanner.close();
	}

}
