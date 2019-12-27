package com.bcits.collections.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<Student,Integer> tr = new TreeMap<Student,Integer>(new ComparatorLogic()); 
		tr.put(new Student(10,"Anu"),12);
		tr.put(new Student(20,"Ramesh"),34);
		tr.put(new Student(40, "Maheswar"),60);
	    Set<Map.Entry<Student,Integer>> s1= tr.entrySet();
	    for (Entry<Student, Integer> entry : s1) {
	    	System.out.println(entry);
			
		}
	    System.out.println(".............iterator()..................");
	    
	    Iterator itr = s1.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }

	}

}
