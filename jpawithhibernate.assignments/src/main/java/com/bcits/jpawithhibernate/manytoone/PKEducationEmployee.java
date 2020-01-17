package com.bcits.jpawithhibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class PKEducationEmployee implements Serializable {

	private int empId;
	private String educationType;
}


