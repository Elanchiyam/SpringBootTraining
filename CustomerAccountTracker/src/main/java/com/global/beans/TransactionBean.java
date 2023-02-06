package com.global.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class TransactionBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId; 
	private String beneficiaryName;
	private  String beneficiaryAccountNumber;
	private Double amount;
	private Double balanceAmount;
}
