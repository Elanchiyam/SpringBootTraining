package com.global.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@Entity
@Data
@Table(name = "employeeboot")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String ename;
	private Integer salary;
	
}
