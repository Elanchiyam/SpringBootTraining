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
public class CustomerBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private Long accountNumber; 
	private String name;
	private String gender;
	private String contact;
	private String aadharNo; 
	private String accountType;
}
