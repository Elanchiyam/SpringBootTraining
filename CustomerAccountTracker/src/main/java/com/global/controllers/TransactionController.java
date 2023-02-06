package com.global.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.global.beans.AccountBean;
import com.global.beans.TransactionBean;
import com.global.services.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionService ts;
	
	@RequestMapping(value="/{accountNumber}", method=RequestMethod.PUT)
	public String AmountTransfer(@PathVariable("accountNumber") Long accountNumber,@RequestBody TransactionBean tb, AccountBean ab)
	{
		return ts.AmountTransfer(accountNumber,tb,ab);
	}
}
