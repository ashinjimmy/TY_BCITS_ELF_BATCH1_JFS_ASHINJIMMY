package com.bcits.usecase.dao;

import java.util.List;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;

public interface EmployeeDAO {
	public EmployeeMasterBean empAuthentication(int empId, String password);
	public long numberOfConsumers(String  region);
	public List<ConsumerMasterBean> showAllConsumerDetails(String region);
	public boolean addCurrentBill(CurrentBillBean currentBillBean);
	public ConsumerMasterBean getConsumer(String rrNumber);
	public double  getIntialReading(String rrNumber);

}
