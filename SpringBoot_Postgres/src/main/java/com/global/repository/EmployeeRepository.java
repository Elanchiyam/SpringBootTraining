package com.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.global.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

}
