package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;

public interface CustomerDAO {
	public boolean consumerSignUp(ConsumerMasterBean consumerBean);
	public ConsumerMasterBean consumerLogin(String emailId, String password);
	public boolean payment(String rrNumber, Date date , double billAmount);
	public CurrentBillBean showCurrentBill(String rrNumber);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
    public List<MonthlyConsumption> monthlyConsumption(String rrNumber);
    public  ConsumerMasterBean  getConsumer(String rrNumber);
    public double previousReading(String rrNumber);
 }

