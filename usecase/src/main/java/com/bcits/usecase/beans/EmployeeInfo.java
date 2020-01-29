package com.bcits.usecase.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeInfo implements Serializable {
	
	private int empId;
	private String  password;
	private String empName;
	
	/*
	 * public int getEmpId() { return empId; } public void setEmpId(int empId) {
	 * this.empId = empId; } public String getEmpName() { return empName; } public
	 * void setEmpName(String empName) { this.empName = empName; }
	 */
	
}
