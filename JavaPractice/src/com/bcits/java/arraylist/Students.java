package com.bcits.java.arraylist;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		//Scanner sc5 = new Scanner(System.in);
		
		StudentsInfo s1 = new StudentsInfo ();
		s1.setId(sc1.nextInt());
		s1.setName(sc1.nextLine());
		s1.setDept(sc1.nextLine());
		s1.setMarks(sc1.nextDouble());
		
		StudentsInfo s2 = new StudentsInfo ();
		s2.setId(sc2.nextInt());
		s2.setName(sc2.nextLine());
		s2.setDept(sc2.nextLine());
		s2.setMarks(sc2.nextDouble());
		
		StudentsInfo s3 = new StudentsInfo ();
		s3.setId(sc3.nextInt());
		s3.setName(sc3.nextLine());
		s3.setDept(sc3.nextLine());
		s3.setMarks(sc3.nextDouble());
		
		StudentsInfo s4 = new StudentsInfo ();
		s4.setId(sc4.nextInt());
		s4.setName(sc4.nextLine());
		s4.setDept(sc4.nextLine());
		s4.setMarks(sc4.nextDouble());
		
		Object []obj = {s1,s2,s3,s4};
		
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}

}
