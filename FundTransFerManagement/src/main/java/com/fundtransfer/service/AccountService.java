package com.fundtransfer.service;

import java.util.List;

import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Customer;

public interface AccountService {

	public List<Account> getAllAccounts();

	Account createAccount(Account account);

	void transfer(Long fromacc, Long toacc, Double amount) throws Throwable;

	
}
