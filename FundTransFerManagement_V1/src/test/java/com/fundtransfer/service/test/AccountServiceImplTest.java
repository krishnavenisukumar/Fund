package com.fundtransfer.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.fundtransfer.entities.Account;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.serviceImpl.AccountServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceImplTest {

	@Mock
	AccountRepo accountRepo;

	@InjectMocks
	AccountServiceImpl accountServiceImpl;

	Account account = null;
	List<Account> accounts = null;

	@Before
	public void before() {
		account = new Account();
		accounts = new ArrayList<>();
		account.setAccountNumber(1L);
		account.setActive(true);
		account.setBalance(10000.00);
		accounts.add(account);

	}

	@Test
	public void getAccountTest() {
		Mockito.when(accountRepo.findAll()).thenReturn(accounts);
		List<Account> response = accountServiceImpl.getAllAccounts();
		assertEquals(accounts.size(), response.size());

	}

}
