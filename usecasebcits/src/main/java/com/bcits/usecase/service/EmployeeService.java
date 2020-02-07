package com.bcits.usecase.service;

import java.util.List;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.EmployeeMasterBean;

public interface EmployeeService {
	
	public EmployeeMasterBean empAuthentication(int empId,String password);
	public long numberOfConsumers(String  region);
	public List<ConsumerMasterBean> showAllConsumerDetails(String region);
}
