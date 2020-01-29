package com.bcits.usecase.beans;

public class ConsumerDetails {
	
	
	private int consumerId;
	private String consumerName;
	private double bill;
	private String consumerType;
	
	
	public ConsumerDetails(int consumerId, String consumerName, double bill, String consumerType) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.bill = bill;
		this.consumerType = consumerType;
	}
	
	
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public String getConsumerType() {
		return consumerType;
	}
	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}
	@Override
	public String toString() {
		return "ConsumerDetails \n Consumer Id = " + consumerId + "\n Consumer Name = " + consumerName + "\n Bill Amount = " + bill
				+ "\n Consumer Type=" + consumerType;
	}
	

}
