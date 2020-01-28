package com.bcits.springrestjaxb.beans;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("user-info-jason")
@JsonPropertyOrder({ "deptId", "empName", "bloodgrp" })
@XmlRootElement(name = "user-info")
@XmlAccessorType(XmlAccessType.FIELD)

public class UserInfoBean {

	@JsonProperty("employeeID")
	@XmlElement(name = "user-id")
	private Integer empId;
	@XmlElement
	// @XmlAttribute(name = "emp-name")
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
	@XmlElement
	private Integer deptId;
	@XmlElement
	private Integer managerId;
	@JsonIgnore
	@XmlElement
	// @XmlTransient // to avoid binding of the field
	private String password;

	@XmlElement(name = "user-other-info")
	private UserOtherInfoBean userOtherInfoBean;

	@XmlElementWrapper(name = "user-address-list")
	private List<UserAddressBean> userAddressList;

}// end of class
