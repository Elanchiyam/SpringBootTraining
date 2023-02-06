package com.global.model;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Employee")
public class Employee {
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String eployeeName;
	private Integer salary;
	
}
