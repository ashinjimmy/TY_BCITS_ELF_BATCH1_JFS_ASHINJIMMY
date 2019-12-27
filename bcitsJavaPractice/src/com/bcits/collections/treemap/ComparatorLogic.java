package com.bcits.collections.treemap;

import java.util.Comparator;

public class ComparatorLogic implements Comparator<Student> {

	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return o1.age - o2.age;
		return o1.name.compareTo(o2.name);
	}
	

}
