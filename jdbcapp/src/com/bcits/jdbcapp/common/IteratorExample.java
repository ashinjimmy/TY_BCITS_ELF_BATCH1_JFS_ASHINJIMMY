package com.bcits.jdbcapp.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> myData = new ArrayList<>();
		myData.add("one");
		myData.add("Two");
		myData.add("Three");
		myData.add("Four");
		
		Iterator<String> itr = myData.iterator();
		
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.println(val);
		}
		
	}//End of main()

}//End of Class
