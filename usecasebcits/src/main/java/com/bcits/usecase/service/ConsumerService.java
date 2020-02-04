package com.bcits.usecase.service;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;

public interface ConsumerService {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String  confirmed);
	public ConsumerMasterBean consumerLogin(String emailId, String password);
	public boolean payment(String rrNumber, Date date, double amount);
	public CurrentBillBean showCurrentBill(String rrNumber);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
    public List<MonthlyConsumption> monthlyConsumption(String rrNumber);
}
