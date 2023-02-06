package com.global.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.global.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee , Integer> {

}
