package com.bcits.java.arraylist;

import java.io.Serializable;

public class StudentsInfo implements Serializable {
	
	private int id;
	private String name;
	private double marks;
	private String dept;
	
	public StudentsInfo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "id= " + id + ", name= " + name + ", marks= " + marks + ", dept= " + dept ;
	}
	
	
	
	
}
