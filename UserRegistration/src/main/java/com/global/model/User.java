package com.global.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_table")
public class User {
	@Id
	private Integer  id;
	private String firstName;
    private String lastName;

}
