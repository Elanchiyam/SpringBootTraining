package com.global.service;

import java.util.HashSet;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.model.Employee;
import com.global.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	

	@Override
	public HashSet<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		HashSet<Employee> employeeList = new HashSet<>();
		employeeRepository.findAll().forEach(e->employeeList.add(e));
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}
	
}
