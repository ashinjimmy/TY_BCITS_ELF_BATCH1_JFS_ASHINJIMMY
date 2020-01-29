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
@Table(name = "Consumer_Info")
public class ConsumerInfo implements Serializable {

	@Id
	@Column
	private int consumerId;

	@Column
	private String consumerName;

	@Column
	private long MobileNo;

	@Column
	private String mailId;

	@Column
	private Date dob;

	@Column
	private Date doj;


	@Column
	private String bloodGrp;

	
	@Column
	private String password;
	
	

}

