package com.bcits.springcoreannotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcoreannotation.beans.EmployeeBean;
import com.bcits.springcoreannotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        
		// For the Destruction phase of life-cycle
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		  
		EmployeeBean employeeBean1 = context.getBean(EmployeeBean.class);
		System.out.println("Enter the Employee name : ");
		employeeBean1.setName(scanner.nextLine());
		System.out.println("Enter the age : ");
		employeeBean1.setAge(scanner.nextInt());
		scanner.nextLine();

		EmployeeBean employeeBean2 = context.getBean(EmployeeBean.class);
		System.out.println("Enter the Employee name : ");
		employeeBean2.setName(scanner.nextLine());
		System.out.println("Enter the age : ");
		employeeBean2.setAge(scanner.nextInt());

		System.out.println("Employee Name : " + employeeBean1.getName());
		System.out.println("Employee Age " + employeeBean1.getAge());
        System.out.println("--------------------------------------------");
		System.out.println("Employee Name : " + employeeBean2.getName());
		System.out.println("Employee Age " + employeeBean2.getAge());

		/*
		 * System.out.println("Employee Name : "+ employeeBean.getName());
		 * System.out.println("Employee Age : "+employeeBean.getAge());
		 */

	}// End of main()

}// End of Class
