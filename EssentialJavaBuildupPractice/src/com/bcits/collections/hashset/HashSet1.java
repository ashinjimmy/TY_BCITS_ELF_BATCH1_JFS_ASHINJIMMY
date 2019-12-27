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
		h1.remove(2);
		System.out.println(h1);
		


	}

}
