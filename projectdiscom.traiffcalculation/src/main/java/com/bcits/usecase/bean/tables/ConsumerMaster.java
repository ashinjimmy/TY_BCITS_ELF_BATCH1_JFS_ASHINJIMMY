package com.bcits.usecase.bean.tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Consumer_Master")
public class ConsumerMaster implements Serializable {

	@Id
	@Column
	private int rrNumber;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String password;
	@Column
	private String confirmPassword;
	@Column
	private String emailId;
	@Column
	private long phoneNumber;
	@Column
	private String typeOfConsumer;
	@Column
	private String region;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private int pincode;

}
