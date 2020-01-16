package com.bcits.empwebservletapp.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="primary_employee_info")
public class PrimaryEmployeeInfo implements Serializable {
	
    @Id
    @Column
	private int emp_id;
	
	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "emp_mobile_num")
	private long emp_mobileno;
	
	@Column(name = "official_mail_id")
	private String mailId;
	
	@Column(name = "date_of_birth")
	private Date dob;
	
	@Column(name = " date_of_join")
	private Date doj;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = " blood_group")
	private String bloodgrp;
	
	@Column
	private double salary;

}
