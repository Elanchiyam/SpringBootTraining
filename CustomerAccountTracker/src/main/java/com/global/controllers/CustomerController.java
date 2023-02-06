package com.global.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.global.beans.AccountBean;
import com.global.beans.CustomerBean;
import com.global.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public String CreateCustomer(@RequestBody CustomerBean cb, AccountBean ab)
	{	
		return customerService.CreateCustomer(cb, ab);	
	}
	
	
	@RequestMapping(value="/updateCustomer", method=RequestMethod.PUT)
	public String UpdateCustomer(@RequestBody CustomerBean cb) 
	{
		return customerService.UpdateCustomer(cb);	
	}
	
	
	@RequestMapping(value="/getAllCustomers", method=RequestMethod.GET)
	public List<CustomerBean> GetAllCustomers(CustomerBean cb) 
	{	
		return customerService.GetAllCustomers();	
	}
	
	
	@RequestMapping(value="/getByAcccountNumber/{accountNumber}", method=RequestMethod.GET)
	public CustomerBean GetCustomerByAccNum(@PathVariable("accountNumber") Long accountNumber)
	{
		return customerService.GetCustomerByAccNum(accountNumber);
	}
	
	
	@RequestMapping(value="/deleteCustomerByAccountNumber/{accountNumber}", method=RequestMethod.DELETE)
	public String DeleteCustomerByAccNum(@PathVariable("accountNumber") Long accountNumber)
	{
		return customerService.DeleteCustomerByAccNum(accountNumber);
	}
}
