package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;
import com.bcits.usecase.dao.CustomerDAO;

@Service
public class ConsumerServiceImp implements ConsumerService {

	@Autowired
	private CustomerDAO dao;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean, String confirmed) {
		if (consumerBean.getPassword().equals(confirmed)) {

			return dao.consumerSignUp(consumerBean);
		}

		return false;

	}

	@Override
	public ConsumerMasterBean consumerLogin(String emailId, String password) {
		if (emailId.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(emailId, password);
	}

	@Override
	public boolean payment(String rrNumber, Date date, double amount) {
	
		return dao.payment(rrNumber, date, amount);
	}

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber) {
		return dao.showCurrentBill(rrNumber);

	}

	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {

		return dao.showBillHistory(rrNumber);
	}

	@Override
	public List<MonthlyConsumption> monthlyConsumption(String rrNumber) {

		return dao.monthlyConsumption(rrNumber);
	}

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {
		return dao.getConsumer(rrNumber);
	}

	@Override
	public double previousReading(String rrNumber) {
	return 0;
	}
	
	

}
