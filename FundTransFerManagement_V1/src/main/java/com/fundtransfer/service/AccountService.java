package com.fundtransfer.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.fundtransfer.dto.AccountDto;
import com.fundtransfer.entities.Account;

public interface AccountService {

	public List<Account> getAllAccounts();

	void createAccount(AccountDto dto);

	public void deleteAccount(Long accountNumber) throws AccountNotFoundException ;

	Account retrieveAccount(Long accountNumber) throws AccountNotFoundException;

}
