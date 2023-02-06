package com.global.model;

//import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Document(collection="Book")
@Data
@AllArgsConstructor
public class Book {
	
	
	private Integer id;
	private String name;
	private String title;
}
