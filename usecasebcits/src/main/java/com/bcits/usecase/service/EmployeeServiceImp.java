package com.bcits.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.dao.EmployeeDAO;



@Service
public class EmployeeServiceImp implements  EmployeeService  {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean empAuthentication (int empId, String password) {
	
		if(empId>1 && ! password.isEmpty()) {
			return dao.empAuthentication(empId, password);	
		}
		return null;
	}
	
	public long numberOfConsumers(String  region) {
		if(region != null) {
			return dao.numberOfConsumers(region);
		}
		return 0;
	}

	@Override
	public List<ConsumerMasterBean> showAllConsumerDetails(String region) {
		return  dao.showAllConsumerDetails(region);
	}
	
	

}
	