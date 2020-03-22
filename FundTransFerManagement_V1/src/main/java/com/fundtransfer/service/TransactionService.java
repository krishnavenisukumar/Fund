package com.fundtransfer.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.fundtransfer.entities.Transaction;
import com.fundtransfer.exception.TransferLimitExceedException;

public interface TransactionService {

	List<Transaction> getAllTransaction();

	public void fundTransfer(Long fromAcc, Long toAcc, Double amount) throws TransferLimitExceedException, AccountNotFoundException;

}
