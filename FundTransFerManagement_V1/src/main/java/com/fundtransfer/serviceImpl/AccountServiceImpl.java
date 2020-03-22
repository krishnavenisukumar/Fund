package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.dto.AccountDto;
import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Customer;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Account> getAllAccounts() {

		return accountRepo.findAll();
	}

	@Override
	public void createAccount(AccountDto dto) {
		Account account = new Account(dto.getIfsc(), dto.getActive(), dto.getBalance(), dto.getAccountType());

		Customer customer = new Customer(dto.getCustomer_name(), dto.getCustomer_address(), dto.getCustomer_email(),
				dto.getCustomer_contact(), dto.getIsEligible());
		customer.addAccountList(account);
		customerRepo.save(customer);
	}

	@Override
	public void deleteAccount(Long accountNumber) throws AccountNotFoundException {
		Account account = accountRepo.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		accountRepo.delete(account);
	}

	@Override
	public Account retrieveAccount(Long accountNumber) throws AccountNotFoundException 
 {
		Account accountList = accountRepo.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		return accountList;
	}

}
