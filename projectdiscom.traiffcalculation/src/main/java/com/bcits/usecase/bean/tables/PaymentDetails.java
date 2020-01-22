package com.bcits.usecase.bean.tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Payment_Details")
public class PaymentDetails implements Serializable{

	@Id
	@Column
	private double rrNumber;
	@Column
	private String name;
	@Column
	private double  billAmount;
	@Column
	private String paymentStatus;
}