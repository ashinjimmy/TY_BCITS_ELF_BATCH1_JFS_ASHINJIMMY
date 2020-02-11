package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.QueryMsgBean;

public interface EmployeeDAO {
	public EmployeeMasterBean empAuthentication(int empId, String password);
	public long numberOfConsumers(String  region);
	public List<ConsumerMasterBean> showAllConsumerDetails(String region);
	public boolean addCurrentBill(CurrentBillBean currentBillBean);
	public ConsumerMasterBean getConsumer(String rrNumber);
	public double  getIntialReading(String rrNumber);
	public List<QueryMsgBean> getQueryList(String region);
	public boolean sendRespond(String rrNumber,String response ,Date date);

}
