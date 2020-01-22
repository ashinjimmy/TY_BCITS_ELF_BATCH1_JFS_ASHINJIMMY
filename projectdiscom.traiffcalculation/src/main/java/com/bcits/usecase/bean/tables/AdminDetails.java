package com.bcits.usecase.bean.tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Admin_Details")
public class AdminDetails implements Serializable{

	@Id
	@Column
	private int Id;
	@Column
	private String name;
	@Column
	private String emailId;
	@Column
	private String password;
}