package com.bcits.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new <Integer,String> HashMap();
		h1.put(10, "Anush");
		h1.put(20,"Karthik");
		h1.put(30, "Vadhi");
		h1.put(70, "Mahesh");
		
		Set<Map.Entry<Integer,String>> s1 = h1.entrySet();
		for (Map.Entry<Integer, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("......................");
		}
		System.out.println(h1.get(30));
		System.out.println("................................");
		Set<Integer> s21 = h1.keySet();
		for (Integer integer : s21) {
			System.out.println(integer);
			
		}
		System.out.println("..........................");
		Collection<String> str3 = h1.values();
		for (String string : str3) {
			System.out.println(string);
		}
	}

}
