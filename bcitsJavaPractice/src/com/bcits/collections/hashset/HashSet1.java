package com.bcits.collections.hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(100);
		h1.add(null);
		h1.add(10);
		h1.add(null);
		System.out.println(h1);
		h1.remove(20);
		System.out.println(h1);
		System.out.println(h1.contains(20));
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());
		System.out.println("......................");
		HashSet<Integer> h2 = new HashSet<Integer>();
		h2.add(70);
		h2.add(78);
		h2.add(100);
		System.out.println(h2);
		h2.addAll(h1);
		System.out.println(h2);
		h2.removeAll(h1);
		System.out.println();
		h2.add(70);
		h2.add(78);
		h2.add(100);
		h1.retainAll(h2);
		System.out.println(h1);
		System.out.println(h2);
		


	}

}
