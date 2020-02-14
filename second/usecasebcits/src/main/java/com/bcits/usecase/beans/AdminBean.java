package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="admin_master_info")
public class AdminBean implements Serializable {
	
	@Id
    @Column(name = "admin_id")
	private int adminId;
	@Column
	private String name;
	@Column
	private String password;
	
}
