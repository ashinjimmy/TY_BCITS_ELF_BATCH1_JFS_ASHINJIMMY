package com.bcits.usecase.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MonthlyConsumptionPk  implements Serializable{
	
	@Column(name = "rr_number")
	private String rrNumber;
	@Column()
	private Date date;

}
