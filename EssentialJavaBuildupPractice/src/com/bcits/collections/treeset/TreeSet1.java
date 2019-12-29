package com.bcits.collections.treeset;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Person> ts1 = new TreeSet<Person>();
		ts1.add(new Person(10,"Anu"));
		ts1.add(new Person(20,"Ramya"));
		ts1.add(new Person(30,"Dhanya"));
		
		System.out.println(ts1);

	}

} 
