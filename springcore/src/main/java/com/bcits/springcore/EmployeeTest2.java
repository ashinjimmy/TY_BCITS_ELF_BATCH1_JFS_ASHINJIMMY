package com.bcits.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.springcore.beans.EmployeeBean;
import com.bcits.springcore.beans.EmployeeBean1;

public class EmployeeTest2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		EmployeeBean1 employeeBean = context.getBean("employee", EmployeeBean1.class);
		
		System.out.println("Nmae = "+ employeeBean.getName());
		System.out.println("Age = "+ employeeBean.getAge());
		System.out.println("Dept ID = "+employeeBean.getDepartmentBean().getDeptId());
		System.out.println("Dept Name = "+employeeBean.getDepartmentBean().getDeptName());
	}

}
