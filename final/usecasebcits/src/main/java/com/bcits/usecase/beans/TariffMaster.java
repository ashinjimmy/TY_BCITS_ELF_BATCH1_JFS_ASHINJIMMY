package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name= "tariff_master")
public class TariffMaster  implements Serializable {
	@EmbeddedId
	private TariffMasterPk tariffMasterPk;
	@Column
	private double amount;

}
