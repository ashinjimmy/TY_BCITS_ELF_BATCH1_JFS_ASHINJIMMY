package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "monthly_consumption")
public class MonthlyConsumption  implements Serializable{

	@EmbeddedId
	private MonthlyConsumptionPk monthlyConsumptionPk;
	@Column(name = "bill_amount")
	private double billAmount;
	@Column(name = "total_units")
	private double totalUnits;
	@Column
	private String region;
	@Column(name = "prev_reading")
	private double prevReading;
	@Column(name = "current_Reading")
	private double currentReading;
	@Column 
	private String status;
}
