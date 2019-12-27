package com.bcits.collections.treeset;

public class Person implements Comparable<Person> {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
//	public int compareTo(Person o1) {
//		return this.age - (o1.age);
//	}
	@Override
	public int compareTo(Person o) {
	   
		return this.name.compareTo(o.name);
	}

	
	@Override
	public String toString() {
		return "age = " + age + ", name = " + name ;
	}
	

}
