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

import com.fundtransfer.entities.Customer;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.serviceImpl.CustomerServiceImpl;

@RunWith(MockitoJUnitRunner.class)

public class CustomerServiceImplTest {

	@Mock
	CustomerRepo customerRepo;

	@InjectMocks
	CustomerServiceImpl customerServiceImpl;

	Customer customer = null;
	List<Customer> customers = null;

	@Before
	public void before() {
		customer = new Customer();
		customers = new ArrayList<>();
		customer.setCustomer_name("krishna");
		customer.setCustomer_address("CBE");
		customer.setCustomer_email("krish12@gmail.com");
		customer.setCustomer_contact(985656776L);
		customers.add(customer);

	}

	@Test
	public void getAllCustomerTest() {

		Mockito.when(customerRepo.findAll()).thenReturn(customers);
		List<Customer> response = customerServiceImpl.getAllCustomer();
		assertEquals(customers.size(), response.size());
	}

}
