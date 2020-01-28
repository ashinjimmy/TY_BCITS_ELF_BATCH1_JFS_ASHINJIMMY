package com.bcits.springrestjaxb.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("employeeInfo")
@JsonPropertyOrder({"deptId","empName", "salary"})//For the priority order
@XmlRootElement(name = "Employee-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeePrimaryInfo {
	
    @JsonProperty("employeeID")
	@XmlElement(name = "employee-id")
	private Integer empId;
	 @XmlElement
	//@XmlAttribute(name = "emp-name")
	private String empName;
	@XmlElement
	private Long empMobileno;
	@XmlElement
	private String mailId;
	@XmlElement
	private Date dob;
	@XmlElement
	private Date doj;
	@XmlElement
	private String designation;
	@XmlElement
	private String bloodgrp;
	@XmlElement
	private Double salary;
	@JsonProperty("departmentId")
	@XmlElement
	private Integer deptId;
	@XmlElement
	private Integer managerId;
	@XmlElement
	// @XmlTransient // to avoid binding of the field
	private String password;
	
	

}// End of class
