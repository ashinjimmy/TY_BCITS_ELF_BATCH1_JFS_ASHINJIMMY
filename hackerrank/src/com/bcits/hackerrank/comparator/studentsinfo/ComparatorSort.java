package com.bcits.hackerrank.comparator.studentsinfo;

import java.util.Comparator;

public class ComparatorSort implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {

		if (o1.getCgpa() < o2.getCgpa()) {
			return 1;

		} else if (o1.getCgpa() > o2.getCgpa()){
			return -1;
		} else if (o1.getName() != o2.getName()) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getId() - o2.getId();
		}
	}
}






