package com.bcits.springmvc.curdoperations;

import java.util.List;

import com.bcits.springmvc.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean authenticate(Integer empId, String password);
	
	public boolean addEmployee(EmployeeInfoBean bean);
	
	public boolean deleteEmployee(Integer empId);
	
	public EmployeeInfoBean getEmployee(Integer EempId);
	
	public boolean updateEmployee (EmployeeInfoBean bean);
	
	public List<EmployeeInfoBean> getallEmployees();

}
