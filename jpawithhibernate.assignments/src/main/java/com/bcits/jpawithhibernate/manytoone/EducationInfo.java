package com.bcits.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeEducationInfo")
public class EducationInfo {
	
	@EmbeddedId
	private PKEducationEmployee education;
	@Column
	private String collegeName;
	@Column
	private int yearOfPassout;
	@Column
	private String stream;
	@Column
	private double percentage;
	@Column
	private String university;
	
	
	@MapsId("empId")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId")
	private PrimaryEmployeeInfo  primaryInfo;

}
