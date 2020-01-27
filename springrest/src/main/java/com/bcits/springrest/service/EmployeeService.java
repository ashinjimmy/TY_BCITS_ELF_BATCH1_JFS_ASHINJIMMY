package com.bcits.springrest.service;

import java.util.List;

import com.bcits.springrest.beans.EmployeeInfoBean;



public interface EmployeeService {
	
public EmployeeInfoBean authenticate(Integer empId, String password);
	
	public boolean addEmployee(EmployeeInfoBean bean);
	
	public boolean deleteEmployee(Integer empId);
	
	public EmployeeInfoBean getEmployee(Integer EempId);
	
	public boolean updateEmployee (EmployeeInfoBean bean);
	
	public List<EmployeeInfoBean> getallEmployees();


}//End of interface
