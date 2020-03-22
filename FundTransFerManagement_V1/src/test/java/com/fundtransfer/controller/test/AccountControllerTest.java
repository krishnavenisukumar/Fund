package com.fundtransfer.controller.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fundtransfer.controller.AccountController;
import com.fundtransfer.dto.AccountDto;
import com.fundtransfer.entities.Account;
import com.fundtransfer.service.AccountService;

@RunWith(MockitoJUnitRunner.class)
public class AccountControllerTest {

	@Mock
	AccountService service;

	@InjectMocks
	AccountController controller;

	Account account = null;
	AccountDto dto = null;
	List<Account> accounts = null;
	List<Account> accounts1 = null;

	@Before
	public void before() {
		account = new Account();
		dto = new AccountDto();

		accounts = new ArrayList<>();
		dto.setBalance(30000.0);
		dto.setCustomer_name("krishna");
		dto.setCustomer_address("CBE");
		dto.setCustomer_email("krish12@gmail.com");
		dto.setCustomer_contact(985656776L);
		accounts.add(account);

		accounts1 = new ArrayList<>();
		account.setAccountNumber(1L);
		account.setActive(true);
		account.setBalance(10000.00);
		accounts1.add(account);

	}

	@Test
	public void testNewAccountPositive(){

		Mockito.when(service.getAllAccounts()).thenReturn(accounts1);
		ResponseEntity<List<AccountDto>> response = controller.getAllAccount();
		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

	@Test
	public void testNewAccountNegative() {
		Mockito.when(service.getAllAccounts()).thenReturn(accounts);
		ResponseEntity<List<AccountDto>> response = controller.getAllAccount();
		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

}
