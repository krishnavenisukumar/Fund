package com.fundtransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fundtransfer.dto.AccountDto;
import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Customer;
import com.fundtransfer.service.AccountService;
import com.fundtransfer.service.CustomerService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerService customerService;

	@Autowired
	public AccountController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping(path = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK);
	}

	@GetMapping(path = "/account")
	public ResponseEntity<List<AccountDto>> getAllAccount() {
		return new ResponseEntity<List<AccountDto>>(HttpStatus.OK);
	}

	@PostMapping(path = "/createaccount")
	public ResponseEntity<Account> createaccount(@RequestBody AccountDto dto) {

		accountService.createAccount(dto);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
