package com.bcits.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.springmvc.beans.EmployeeInfoBean;
import com.bcits.springmvc.curdoperations.EmployeeDAO;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;



	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
	return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		return dao.addEmployee(bean);
	}

	@Override
	public EmployeeInfoBean getEmployee(int EempId) {
		
		return dao.getEmployee(EempId);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		return dao.updateEmployee(bean);
	}

	@Override
	public List<EmployeeInfoBean> getallEmployees() {
	
		return dao.getallEmployees();
	}

	@Override
	public boolean deleteEmployee(int empId) {
	
		if(empId < 1) {
		return false;
	}
		return dao.deleteEmployee(empId);
	}//End of deleteEmployee()

	

	

	
}
