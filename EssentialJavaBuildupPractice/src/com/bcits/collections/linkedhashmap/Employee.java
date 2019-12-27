package com.bcits.collections.linkedhashmap;

public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id= " + id + ", name= " + name;
	}
	

}
