package com.bcits.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(19);
		a1.add(17);
		a1.add(23);
		
		List l1 = a1.stream().map(i-> i*2).collect(Collectors.toList());
		List l2 = a1.stream().filter(i-> (i%2==0)).collect(Collectors.toList());
		
		for (Object object : l2) {
			
			System.out.println(object);
		}

		
	}

}
