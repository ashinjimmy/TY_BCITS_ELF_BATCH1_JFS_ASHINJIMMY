package com.bcits.springcoreannotation.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcoreannotation.config.EmployeeConfig2;

public class EmpoyeeTest2 {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig2.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		System.out.println("Employee Naem :" + employeeBean.getName());
		System.out.println("Employee Age :" + employeeBean.getAge());
		System.out.println("Dept Name : " + employeeBean.getDepartmentBean().getDeptName());
		System.out.println("Dept ID : " + employeeBean.getDepartmentBean().getDeptId());

	}// End of main()

}// End of class
