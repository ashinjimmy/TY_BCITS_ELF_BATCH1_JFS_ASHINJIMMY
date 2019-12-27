package com.bcits.collections.learning;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(12);
		v1.add(25);
		v1.add(45);
		v1.add(null);
		v1.add(null);
		v1.add(25);
		v1.add(12);
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		System.out.println("Capacity "+v1.capacity());
		System.out.println(v1.isEmpty());
		System.out.println(v1);
		v1.setSize(3);
		System.out.println(v1);
		System.out.println(v1.capacity());
		v1.setElementAt(100, 2);
		System.out.println(v1);
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());



	}

}
