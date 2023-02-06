package com.global.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.beans.AccountBean;
import com.global.repository.AccountRepository;

@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private CustomerService customerService;
	
	public AccountBean 	GetAccDetailsByAccNum(Long	accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber).get();
	}

}
