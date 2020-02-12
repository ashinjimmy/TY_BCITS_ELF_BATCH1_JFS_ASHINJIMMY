package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.dao.EmployeeDAO;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean empAuthentication(int empId, String password) {

		if (empId > 1 && !password.isEmpty()) {
			return dao.empAuthentication(empId, password);
		}
		return null;
	}

	public long numberOfConsumers(String region) {
		if (region != null) {
			return dao.numberOfConsumers(region);
		}
		return 0;
	}

	@Override
	public List<ConsumerMasterBean> showAllConsumerDetails(String region) {
		return dao.showAllConsumerDetails(region);
	}

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {

		return null;
	}// End of getConsumer()

	@Override
	public boolean addCurrentBill(CurrentBillBean currentBillBean) {

		return dao.addCurrentBill(currentBillBean);
	}// End of addCurrentBill()

	@Override
	public double getIntialReading(String rrNumber) {
		return dao.getIntialReading(rrNumber);
	}

	@Override
	public List<QueryMsgBean> getQueryList(String region) {
		if (region != null) {
			return dao.getQueryList(region);
		}
		return null;
	}

	@Override
	public boolean sendRespond(String rrNumber, String response, Date date) {
		return dao.sendRespond(rrNumber, response, date);
	}//sendRespond()


}
