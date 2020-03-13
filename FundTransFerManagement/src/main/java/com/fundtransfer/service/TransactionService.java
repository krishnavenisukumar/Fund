package com.fundtransfer.service;

import java.util.List;

import com.fundtransfer.entities.Transaction;

public interface TransactionService {

	List<Transaction> getAllTransaction();

	List<Transaction> findByfromacc(Long fromacc);

}
