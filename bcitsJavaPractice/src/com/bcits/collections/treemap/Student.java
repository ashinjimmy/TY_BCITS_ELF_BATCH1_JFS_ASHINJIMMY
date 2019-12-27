package com.bcits.collections.treemap;

public class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
//
//	@Override
//	public int compareTo(Student o) {
//		return this.age - (o.age);
//	}
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	

	@Override
	public String toString() {
		return "age=" + age + ", name=" + name;
	}

}
