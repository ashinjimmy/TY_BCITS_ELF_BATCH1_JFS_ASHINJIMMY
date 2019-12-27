package com.bcits.collections.learning;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(88);
		l1.add(39);
		l1.add(49);
		l1.add(10);
		
		System.out.println("Displaying the LinkedList elements "+ l1);
		System.out.println("..........add(index,ele)..............\n");
		l1.add(1, 100);
		System.out.println(l1);
		System.out.println("...........remove()....................\n");
		l1.remove(1);
		System.out.println(l1);
		System.out.println(".................size().............\n");
		l1.size();
		System.out.println(l1);
		System.out.println("................isEmpty()............\n");
		System.out.println(l1.isEmpty());
		System.out.println("................indexOf().............\n");
		System.out.println(l1.indexOf(10));
		System.out.println("................lastIndexOf()..........\n");
		System.out.println(l1.lastIndexOf(10));
		l1.set(0, 6);
		l1.add(null);
		l1.add(null);
		l1.add(88);
		
		System.out.println(l1);

	}

	
}

