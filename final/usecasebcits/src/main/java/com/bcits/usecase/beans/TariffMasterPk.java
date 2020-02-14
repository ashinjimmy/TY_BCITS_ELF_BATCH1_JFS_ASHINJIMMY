package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class TariffMasterPk  implements Serializable{
	@Column(name = "type_of_consumer")
	private String typeOfConsumer;
	@Column
	private Long range;

}