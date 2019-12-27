package com.bcits.collections.learning;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(90);
		a1.add(23);
		a1.add(110);
		System.out.println(a1);
		a1.add(1, 100);
		System.out.println(".............");
		System.out.println(a1);

		a1.remove(1);
		a1.remove(new Integer(90));//Boxing the value to avoid the confusion of the object and index parameters od remove()
		System.out.println(a1);
		a1.set(0, 36);
		System.out.println(a1);
		a1.add(36);
		System.out.println(a1);
		System.out.println("Displaying the index value of first occurance of 36 is "+a1.indexOf(36));
		System.out.println("Displaying the index value of last occurance of 36 is "+a1.lastIndexOf(36));
		System.out.println("Displaying the elements\n");

		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));

		}


		System.out.println("...............subList().................");
		List l1 = a1.subList(0,4);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));

		}

		System.out.println("...............................................");
		a1.add(null);
		a1.add(null);
		a1.add(36);
		a1.add(36);
		System.out.println(a1);

	}

}
