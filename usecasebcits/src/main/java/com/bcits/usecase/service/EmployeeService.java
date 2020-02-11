package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.QueryMsgBean;

public interface EmployeeService {
	
	public EmployeeMasterBean empAuthentication(int empId,String password);
	public long numberOfConsumers(String  region);
	public List<ConsumerMasterBean> showAllConsumerDetails(String region);
	public ConsumerMasterBean getConsumer(String rrNumber);
	public boolean addCurrentBill(CurrentBillBean currentBillBean);
	public double  getIntialReading(String rrNumber);
	public List<QueryMsgBean> getQueryList(String region);
	public boolean sendRespond(String rrNumber,String response ,Date date);

	
}
