package com.bcits.hackerrank.practice;

public class Data {
	private int id;
	private String name;
	private double cgpa;
	
	public Data(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}


	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ", cgpa = "  + cgpa;
	}
	
	
}
