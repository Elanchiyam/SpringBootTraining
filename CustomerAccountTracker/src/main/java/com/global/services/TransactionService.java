package com.global.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.beans.AccountBean;
import com.global.beans.TransactionBean;
import com.global.repository.AccountRepository;
import com.global.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public String AmountTransfer(long accountNumber,TransactionBean tb,AccountBean ab)
	{
		Optional<AccountBean> transaction=accountRepository.findByAccountNumber(accountNumber);
		String result="";
		if(transaction.isPresent())
		{
			tb.setAmount(tb.getAmount());
			tb.setBeneficiaryAccountNumber(tb.getBeneficiaryAccountNumber());
			tb.setBeneficiaryName(tb.getBeneficiaryName());
			AccountBean acc=transaction.get();
			if(acc.getBalanceAmount()>tb.getAmount()){
				tb.setBalanceAmount(acc.getBalanceAmount()-tb.getAmount());
				transactionRepository.save(tb);
				acc.setBalanceAmount(acc.getBalanceAmount()-tb.getAmount());
				accountRepository.save(acc);
				result=result+ " Transaction is successfull";
			}
			else {
				result=result+ "Maximum amount available for transaction is "+acc.getBalanceAmount();
			}
		return result;
		}
		else{
			return "Account Number Not Found";
		}
	}
}
