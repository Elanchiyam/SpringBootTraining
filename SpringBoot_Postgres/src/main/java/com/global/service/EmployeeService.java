package com.global.service;

import java.util.HashSet;

import com.global.model.Employee;

public interface EmployeeService {
	public HashSet<Employee> getAllEmployees();
	public Employee getEmployeeById(Integer id);
	public void addEmployee(Employee employee);
	public void deleteAllEmployees();
	public void deleteEmployeeById(Integer id);
	public void updateEmployee(Employee employee);
}
