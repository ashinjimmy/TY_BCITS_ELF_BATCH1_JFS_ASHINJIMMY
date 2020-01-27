package com.bcits.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.springmvc.beans.EmployeeInfoBean;
import com.bcits.springmvc.curdoperations.EmployeeDAO;
import com.bcits.springmvc.exceptionhandler.EmployeeException;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;



	@Override
	public EmployeeInfoBean authenticate(Integer empId, String password) {
	return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		return dao.addEmployee(bean);
	}

	@Override
	public EmployeeInfoBean getEmployee(Integer EempId) {
		
		if(EempId < 1) {
			throw new EmployeeException("Invalid Employee ID !");
		}
		EmployeeInfoBean employeeInfoBean = dao.getEmployee(EempId);
		if(employeeInfoBean == null) {
			throw new EmployeeException("Employee ID Not Found!");
		}
		return employeeInfoBean;
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
	public boolean deleteEmployee(Integer empId) {
	
		if(empId < 1) {
		return false;
	}
		return dao.deleteEmployee(empId);
	}//End of deleteEmployee()	
}
