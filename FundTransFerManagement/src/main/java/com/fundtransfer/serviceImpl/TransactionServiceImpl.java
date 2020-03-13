package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.entities.Transaction;
import com.fundtransfer.repo.TransactionRepo;
import com.fundtransfer.service.TransactionService;

@Service
@Transactional

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepo transactionRepo;

	@Override
	public List<Transaction> getAllTransaction() {
		return transactionRepo.findAll();
	}

	@Override
	public List<Transaction> findByfromacc(Long fromacc) {
		return transactionRepo.findByfromAcc(fromacc);
	}

}
