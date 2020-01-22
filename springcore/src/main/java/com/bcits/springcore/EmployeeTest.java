package com.bcits.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.springcore.beans.EmployeeBean;

public class EmployeeTest {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * System.out.println("Enter the number of Employees"); int totoalEmpNo =
		 * Integer.parseInt(scanner.nextLine());
		 */
		
		
		EmployeeBean employeeBean = (EmployeeBean)context.getBean("employee");
		
		System.out.println("Enter the Employee Name : ");
	    employeeBean.setName(scanner.nextLine());
		System.out.println("Enter the Employee age : ");
		employeeBean.setAge(scanner.nextInt());
		scanner.nextLine();
		
		EmployeeBean employeeBean2 = (EmployeeBean)context.getBean("employee");
		System.out.println("Enter the Employee Name : ");
	    employeeBean2.setName(scanner.nextLine());
		System.out.println("Enter the age of Employee : ");
		employeeBean2.setAge(scanner.nextInt());
		
		System.out.println("Name = "+employeeBean.getName());
		System.out.println("Age  = "+employeeBean.getAge());
		System.out.println("Name = "+employeeBean2.getName());
		System.out.println("Age  ="+employeeBean2.getAge());
	}	
	
	
}
