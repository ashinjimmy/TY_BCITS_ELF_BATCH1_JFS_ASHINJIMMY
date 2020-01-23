package com.bcits.springcore.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //for parameterised constructor 
public class EmployeeBean1 {
	

	private String name;
	private int age;

	private DepartmentBean departmentBean;
	
	/*
	 * public EmployeeBean1(String name, int age, DepartmentBean departmentBean) {
	 * super(); this.name = name; this.age = age; this.departmentBean =
	 * departmentBean; }
	 */
	
	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public DepartmentBean getDepartmentBean() { return departmentBean; }
	 * 
	 * public void setDepartmentBean(DepartmentBean departmentBean) {
	 * this.departmentBean = departmentBean; }
	 */
}
