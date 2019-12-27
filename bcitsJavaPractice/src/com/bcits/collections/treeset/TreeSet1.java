package com.bcits.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Person> ts1 = new TreeSet<Person>();
		ts1.add(new Person(10,"Anu"));
		ts1.add(new Person(20,"Ramya"));
		ts1.add(new Person(30,"Dhanya"));
		ts1.add(new Person (40,"Abhi"));
		
		System.out.println(ts1);
		
		System.out.println(".....................for each loop ..............");
		
		for (Person person : ts1) {
			System.out.println(person);
			
		}
		System.out.println("......................iterator()...................");
		
		Iterator itr = ts1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

} 
