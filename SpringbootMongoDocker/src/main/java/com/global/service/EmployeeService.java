package com.global.service;

import java.util.List;

import com.global.model.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployees();
	Employee findEmployeeById(Integer id);
	Employee addEmployee(Employee employee);
	void deleteEmployeeById(Integer id);
	void deleteAllData();
}
