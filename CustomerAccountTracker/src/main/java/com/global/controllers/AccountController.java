package com.global.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.global.beans.AccountBean;
import com.global.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/{accountNumber}", method=RequestMethod.GET) 
	public AccountBean GetAccDetailsByAccNum(@PathVariable("accountNumber") Long accountNumber) 
	{
		return accountService.GetAccDetailsByAccNum(accountNumber);
	}
}
