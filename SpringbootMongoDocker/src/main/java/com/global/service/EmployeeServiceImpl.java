package com.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;

import com.global.model.Employee;
import com.global.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return null;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
	}
	
}
