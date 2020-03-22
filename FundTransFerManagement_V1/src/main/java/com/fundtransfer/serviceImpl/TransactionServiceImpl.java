package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.constant.Constant;
import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Transaction;
import com.fundtransfer.exception.TransferLimitExceedException;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.repo.TransactionRepo;
import com.fundtransfer.service.TransactionService;

@Service
@Transactional

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepo transactionRepo;
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public List<Transaction> getAllTransaction() {

		return transactionRepo.findAll();

	}

	@Override
	public void fundTransfer(Long fromAcc, Long toAcc, Double amount)
			throws TransferLimitExceedException, AccountNotFoundException{
		if (amount <= Constant.Transfer_Amount) {
			Account account = accountRepo.findById(fromAcc).orElseThrow(AccountNotFoundException::new);
			account.setBalance(account.getBalance() - amount);
			accountRepo.save(account);
			Account account1 = accountRepo.findById(toAcc).orElseThrow(AccountNotFoundException::new);
			account1.setBalance(account1.getBalance() + amount);

			accountRepo.save(account1);
		} else {
			throw new TransferLimitExceedException(Constant.TransferAmountExceeded);
		}
	}
}
