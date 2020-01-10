package com.bcits.jpawithhibernateapp.employeeinfo.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class FindEmployee {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager1 = entityManagerFactory.createEntityManager();
		EmployeePrimaryInfo info = manager1.find(EmployeePrimaryInfo.class, 10);

		System.out.println("Employee ID   ===> " + info.getEmp_id());
		System.out.println("Employee Name ===> " + info.getEmp_name());
		System.out.println("Employee Mobile Number ===>" + info.getEmp_mobileno());
		System.out.println("Date of Birth ===> " + info.getDob());
		System.out.println("Date of Join ===> " + info.getDoj());
		System.out.println("Designation ===>" + info.getDesignation());
		System.out.println("Blood Group ===>" + info.getBloodgrp());
		System.out.println("Salary ===>" + info.getSalary());
		System.out.println("Department ID ===>" + info.getDept_id());
		System.out.println("Manager ID ===>" + info.getManager_id());

	}// End of the main

}// End of the class
