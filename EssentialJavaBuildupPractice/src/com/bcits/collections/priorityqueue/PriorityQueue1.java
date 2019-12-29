package com.bcits.collections.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(100);
		p1.add(130);
		p1.add(10);
		p1.add(150);
		p1.add(16);
		//p1.add(null);
		p1.add(16);
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		
	


	}

}
