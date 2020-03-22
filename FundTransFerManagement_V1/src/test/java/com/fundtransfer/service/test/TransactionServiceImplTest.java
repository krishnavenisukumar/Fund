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

import com.fundtransfer.entities.Transaction;
import com.fundtransfer.repo.TransactionRepo;
import com.fundtransfer.serviceImpl.TransactionServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceImplTest {

	@Mock
	TransactionRepo transactionRepo;

	@InjectMocks
	TransactionServiceImpl serviceImpl;

	Transaction transaction = null;
	List<Transaction> list = null;

	@Before
	public void before() {
		transaction = new Transaction();
		list = new ArrayList<>();
		transaction.setAmount(10000.00);
		transaction.setBeneficiaryAccno(1L);
		transaction.setFromAcc(1L);
		transaction.setTransactionType("credit");
		list.add(transaction);

	}

	@Test
	public void getAccountTest() {
		Mockito.when(transactionRepo.findAll()).thenReturn(list);
		List<Transaction> response = serviceImpl.getAllTransaction();
		assertEquals(list.size(), response.size());

	}

}
