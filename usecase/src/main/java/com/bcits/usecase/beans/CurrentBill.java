package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "currentBill")
public class CurrentBill implements Serializable {
	@Id
	@Column
	private int rrNumber;
	@Column
	private int consumptionInUnits;
	@Column
	private long initialReadingUnits;
	@Column
	private long finalReadingUnits;
	@Column
	private double billAmount;
	@Column
	private Date dueDate;
}
