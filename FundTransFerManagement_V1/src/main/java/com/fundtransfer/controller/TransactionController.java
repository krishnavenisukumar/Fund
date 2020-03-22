package com.fundtransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fundtransfer.dto.TransactionDto;
import com.fundtransfer.entities.Account;
import com.fundtransfer.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping(path = "/alltransaction")
	public ResponseEntity<List<TransactionDto>> getAllTransaction() {
		return new ResponseEntity<List<TransactionDto>>(HttpStatus.OK);
	}

	@PostMapping(path = "/transfer")
	public ResponseEntity<Account> transferAccount(@RequestBody TransactionDto transactionDto) throws Throwable {

		transactionService.fundTransfer(transactionDto.getFromAcc(), transactionDto.getToAcc(),
				transactionDto.getAmount());

		return new ResponseEntity<>(HttpStatus.OK);

	}

}
