package com.bcits.usecase.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MonthlyConsumptionPk  implements Serializable{
	
	@Column(name = "rr_number")
	private String rrNumber;
	@Column(name = "bill_issued_date")
	private Date date;

}
