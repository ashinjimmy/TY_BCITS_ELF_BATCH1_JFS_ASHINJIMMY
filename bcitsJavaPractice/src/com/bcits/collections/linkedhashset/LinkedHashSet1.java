package com.bcits.collections.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(100);
		//lhs.add(null);
		lhs.add(100);
		lhs.add(490);
		lhs.add(50);
		lhs.add(140);
		lhs.add(109);
		System.out.println(lhs);
		lhs.remove(10);
		System.out.println(lhs);
		System.out.println(lhs.contains(109));


	}

}
