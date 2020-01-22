package com.bcits.usecase.bean;

import java.io.Serializable;

import lombok.Data;

@Data

public class ConsumerDetails implements Serializable {
    
	private int consumerId;
	private String consumerName;
	private double billAmount;
	private String typeOfConsumer;
	
	public ConsumerDetails(int consumerId, String consumerName, double billAmount, String typeOfConsumer) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.billAmount = billAmount;
		this.typeOfConsumer = typeOfConsumer;
	}

	@Override
	public String toString() {
		return "ConsumerDetails [consumerId=" + consumerId + ", consumerName=" + consumerName + ", billAmount="
				+ billAmount + ", typeOfConsumer=" + typeOfConsumer + "]";
	}

}
