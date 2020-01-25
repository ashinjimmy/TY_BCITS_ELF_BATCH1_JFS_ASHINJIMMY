package com.bcits.springmvc.service;

import java.util.List;

import com.bcits.springmvc.beans.EmployeeInfoBean;

public interface EmployeeService {
	
	
public EmployeeInfoBean authenticate(int empId, String password);
	
	public boolean addEmployee(EmployeeInfoBean bean);
	
	public boolean deleteEmployee(int empId);
	
	public EmployeeInfoBean getEmployee(int EempId);
	
	public boolean updateEmployee (EmployeeInfoBean bean);
	
	
	public List<EmployeeInfoBean> getallEmployees();

}//End of Service
