package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "monthly_revenue")
public class MonthlyRevenue implements Serializable {
	
	@EmbeddedId
	private MonthlyConsumptionPk monthlyRevenuePk;
	@Column(name = "bill_amount")
	private double billAmount;
	private String status;
}
