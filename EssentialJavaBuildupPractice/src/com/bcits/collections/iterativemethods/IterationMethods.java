package com.bcits.collections.iterativemethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationMethods {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(100);
		a1.add(120);
		a1.add(139);
		
		System.out.println(a1);
		
		System.out.println("........Using for loop..........");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
		
		System.out.println("........ Using for each loop........");
		for (Integer integer : a1) {
			System.out.println(integer);
			
		}
		
		System.out.println(".........Using iterator() ..........");
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//a1.add(139);
		}
		
		System.out.println(".........Using forward direction listIterator....... ");
		ListIterator ltr1 = a1.listIterator();
		while(ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}
		
		System.out.println(".........Using reverse direction listIterator....... ");
		ListIterator ltr2 = a1.listIterator(a1.size());
		while(ltr2.hasPrevious()) {
			System.out.println(ltr2.previous());
		}
	}

}
