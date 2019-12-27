package com.bcits.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		LinkedHashMap<Employee, Integer> lm = new LinkedHashMap<Employee, Integer>();
		lm.put(new Employee(1000, "Avina"), 100);
		lm.put(new Employee(2000, "Varnitha"), 300);
		lm.put(new Employee(3000, "Prajwal Acharya"), 100);
		lm.put(new Employee(4000, "Vadhi"), 400);

		Set<Entry<Employee, Integer>> s1 = lm.entrySet();
		System.out.println("Displaying the LinkedHashMap elements");
		for (Entry<Employee, Integer> entry : s1) {
			System.out.println(entry);

		}

	}

}
