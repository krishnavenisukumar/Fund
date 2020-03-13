package com.fundtransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Transaction;
import com.fundtransfer.formbean.TransactAccount;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.repo.TransactionRepo;
import com.fundtransfer.service.AccountService;
import com.fundtransfer.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService tnxService;

	@Autowired
	private TransactionRepo tnxRepo;

	private AccountService accService;

	@GetMapping(path = "alltransaction")
	public List<Transaction> getAllTransaction() {
		return tnxService.getAllTransaction();

	}

	@GetMapping(path = "alltransaction/{fromAccount}")
	public ResponseEntity<List<Transaction>> getAllTransactionById(
			@PathVariable(name = "fromAccount") Long fromAccount) {

		return new ResponseEntity<List<Transaction>>(tnxService.findByfromacc(fromAccount), HttpStatus.OK);

	}

	@PostMapping(path = "/transfer")
	public ResponseEntity<Account> transferAccount(@RequestBody TransactAccount transactAccount) throws Throwable {

		accService.transfer(transactAccount.getFromAcc(), transactAccount.getToAcc(), transactAccount.getAmount());

		return new ResponseEntity<>(HttpStatus.OK);

	}

}
