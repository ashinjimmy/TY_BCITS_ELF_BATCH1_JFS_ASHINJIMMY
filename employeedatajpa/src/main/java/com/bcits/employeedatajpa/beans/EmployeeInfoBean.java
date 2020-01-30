package com.bcits.employeedatajpa.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

/*
 * @XmlRootElement(name = "employee-info")
 * 
 * @XmlAccessorType(XmlAccessType.FIELD)
 */
@JsonRootName("employeeInfo")
@JsonPropertyOrder({ "employeeId", "empName" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeeInfoBean {

	
	@JsonProperty("employeeId")
	@Id
	@Column
	private Integer empId;

	@Column
	private String empName;

	@Column
	private Long empMobileno;

	@Column
	private String mailId;

	@Column
	/* @DateTimeFormat(iso=ISO.DATE) */
	private Date dob;

	@Column
	/* @DateTimeFormat(iso=ISO.DATE) */
	private Date doj;

	@Column
	private String designation;

	@Column
	private String bloodgrp;

	@Column
	private Double salary;

	@Column
	private Integer deptId;

	@Column
	private Integer managerId;

	@JsonIgnore
	@Column
	private String password;

}
