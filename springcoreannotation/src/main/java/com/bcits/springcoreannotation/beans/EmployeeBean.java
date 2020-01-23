package com.bcits.springcoreannotation.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class EmployeeBean {

	private String name;
	private int age;
	
	@Autowired(required = false) // example scenario : ok with car without engine
	@Qualifier("acc") // Alternate to @Primary
	private DepartmentBean departmentBean;
	
	/*
	 * @PostConstruct public void init() { System.out.println("It's Init-Phase"); }
	 * 
	 * @PreDestroy public void destroy() { System.out.println("It's Destroy-Phase");
	 * }
	 */

}// End of the Class
