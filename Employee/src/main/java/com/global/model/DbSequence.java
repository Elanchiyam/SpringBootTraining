package com.global.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_sequence")
public class DbSequence {
	@Id
	private String id;
	private Integer seq;
	
	
}
