package com.global.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.global.model.Employee;
import com.global.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
//	@PostMapping("/add")
//	public void addEmployee(@RequestBody Employee employee) {
//		employeeServiceImpl.addEmployee(employee);
//	}
	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addEmployee(@RequestBody Employee employee) {
		try {
			employeeServiceImpl.addEmployee(employee);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
//	@GetMapping("/getEmployees")
//	public HashSet<Employee> getAllEmployees() {
//		return employeeServiceImpl.getAllEmployees();
//	}
	@GetMapping("/getEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeServiceImpl.findAllEmployees(), HttpStatus.OK);
	}
	
//	@GetMapping("/getEmployee/{id}")
//	public Employee getEmployeeById(@PathVariable Integer id) {
//		return employeeServiceImpl.getEmployeeById(id);
//	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
		return new ResponseEntity<>(employeeServiceImpl.findEmployeeById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteEmployees() {
		employeeServiceImpl.deleteAllData();
	}
	
//	@DeleteMapping("/delete/{id}")
//	public void deleteEmployeeById(@PathVariable Integer id) {
//		employeeServiceImpl.deleteEmployeeById(id);
//	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Integer id) {
		try {
			employeeServiceImpl.deleteEmployeeById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
		}
		
	}

}
