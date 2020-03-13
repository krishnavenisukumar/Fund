package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Customer;
import com.fundtransfer.entities.Transaction;
import com.fundtransfer.exception1.NotSufficientFundException;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.repo.AccountTransactionRepo;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.repo.TransactionRepo;
import com.fundtransfer.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private AccountTransactionRepo accountTransactionRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private TransactionRepo transactionRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Account createAccount(Account account) {

		Account acc = accountRepo.save(account);
		customerRepo.save(account.getCustomer());

		return acc;
	}

	@Override
	public void transfer(Long fromAcc, Long toAcc, Double amount) throws Throwable {
		Account account = accountRepo.findById(fromAcc).orElseThrow(AccountNotFoundException::new);
		if (account.getBalance() - amount < 100)
			throw new NotSufficientFundException();
		account.setBalance(account.getBalance() - amount);
		accountRepo.save(account);
		Account account1 = accountRepo.findById(toAcc).orElseThrow(AccountNotFoundException::new);
		account1.setBalance(account1.getBalance() + amount);
		accountRepo.save(account1);
		Transaction log = new Transaction(fromAcc, toAcc, "transfer", amount, "approved");
		transactionRepo.save(log);
	}

}
