package com.bcits.java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {
	int id;
	String name;
	String profile;
	double salary;
	
	

	public EmployeeDetails(int id, String name, String profile, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "id= " + id + ", name= " + name + ", profile= " + profile + ", salary= " + salary ;
	}

	public static void main(String[] args) {
		
		EmployeeDetails em1 = new EmployeeDetails(10, "Ashin",   "Devloper", 15000.00);
		EmployeeDetails em2 = new EmployeeDetails(20, "Dev",     "Devloper", 15000.00);
		EmployeeDetails em3 = new EmployeeDetails(30, "Prashul", "Devloper", 15000.00);
		EmployeeDetails em4 = new EmployeeDetails(40, "Pavan",   "Devloper", 15000.00);
		EmployeeDetails em5 = new EmployeeDetails(50, "Dinesh",  "Devloper", 15000.00);
		
		ArrayList <EmployeeDetails> a1  = new ArrayList <> ();
		a1.add(em1);
		a1.add(em2);
		a1.add(em3);
		a1.add(em4);
		a1.add(em5);
		
		int i=0;
		System.out.println("Displaying the Employee Details.....\n\n");
		while(i < a1.size()) {
			System.out.println(a1.get(i));
			i++;
		}
			
		
	}

}
