package com.global.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.beans.AccountBean;
import com.global.beans.CustomerBean;
import com.global.repository.AccountRepository;
import com.global.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public String CreateCustomer(CustomerBean cb, AccountBean ab) {

		Long accountNumber= Math.abs(generateRandom(12));
		cb.setAccountNumber(accountNumber);
		ab.setAccountNumber(accountNumber);
		ab.setBalanceAmount(50000.0);
		ab.setAccountType(cb.getAccountType());
		ab.setName(cb.getName());
		customerRepository.save(cb);
		accountRepository.save(ab);
		
		return "Customer Added Successfully";	
	}
	

	public String UpdateCustomer(CustomerBean cb) 
	{
		Optional<CustomerBean> customer=customerRepository.findByAccountNumber(cb.getAccountNumber());
		if(customer.isPresent()) {
			CustomerBean customerBean=customer.get();
			customerBean.setName(cb.getName());
			customerBean.setGender(cb.getGender());
			customerBean.setAadharNo(cb.getAadharNo());
			customerBean.setContact(cb.getContact());
			customerBean.setAccountType(cb.getAccountType());
			customerRepository.save(customerBean);
			return "Updated Successfully";
		}
		else {
			return "Account Number not found";	
		}	
	}
	
	public List<CustomerBean> GetAllCustomers() {
		return (List<CustomerBean>) customerRepository.findAll();
	}
	
	public CustomerBean GetCustomerByAccNum(Long accountNumber) {
		return customerRepository.findByAccountNumber(accountNumber).get();
	}
	
	public String DeleteCustomerByAccNum(Long accountNumber) {
		Optional<CustomerBean> customer=customerRepository.findByAccountNumber(accountNumber);
		if(customer.isPresent()) {
			customerRepository.deleteByAccountNumber(accountNumber);
			
			return "Customer deleted succesfully";
		}
		else {
			return "No Customer record exist for given Account Number";
		}	
	}
	
	
	public long generateRandom(int length) {
		Random random=new Random();
		char[] digits=new char[12];
		digits[0]=(char)(random.nextInt(9) +'1');
		for(int i=1;i<12;i++) 
		{
			digits[i]=(char)(random.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}
}
