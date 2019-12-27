package com.bcits.collections.treeset;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(10);
		tr.add(30);
		tr.add(20);
		tr.add(100);
		tr.add(4);
		System.out.println(tr);
		System.out.println(tr.contains(100));

	}

}
