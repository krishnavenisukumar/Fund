
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

import com.fundtransfer.controller.TransactionController;
import com.fundtransfer.dto.TransactionDto;
import com.fundtransfer.entities.Transaction;
import com.fundtransfer.exception.TransferLimitExceedException;
import com.fundtransfer.service.TransactionService;

@RunWith(MockitoJUnitRunner.class)

public class TransactionControllerTest {

	@Mock
	TransactionService service;

	@InjectMocks
	TransactionController controller;

	Transaction transaction = null;
	TransactionDto transactionDto = null;
	List<Transaction> list = null;
	List<Transaction> list2 = null;

	@Before
	public void before() {
		transaction = new Transaction();
		transactionDto = new TransactionDto();

		list2 = new ArrayList<>();
		transactionDto.setAmount(1000.00);
		transactionDto.setFromAcc(1L);
		transactionDto.setToAcc(2L);
		list2.add(transaction);

		list = new ArrayList<>();
		transaction.setAmount(2000.00);
		transaction.setBeneficiaryAccno(2L);
		transaction.setFromAcc(1L);
		transaction.setTransactionType("credit");
		list.add(transaction);
	}

	@Test
	public void testNewTransactionPositive()  {

		Mockito.when(service.getAllTransaction()).thenReturn(list2);
		ResponseEntity<List<TransactionDto>> response = controller.getAllTransaction();
		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

	@Test
	public void testNewTransactionNegative() throws TransferLimitExceedException {
		Mockito.when(service.getAllTransaction()).thenReturn(list);
		ResponseEntity<List<TransactionDto>> responseEntity = controller.getAllTransaction();
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

}
