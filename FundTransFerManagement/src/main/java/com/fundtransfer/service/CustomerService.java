package com.fundtransfer.service;

import java.util.List;

import com.fundtransfer.entities.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();

	public Customer addCustomer(Customer customer);

}
