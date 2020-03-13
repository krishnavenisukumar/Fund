package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.entities.Customer;
import com.fundtransfer.repo.AccountRepo;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public List<Customer> getAllCustomer() {

		return customerRepo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Customer customer2 = customerRepo.save(customer);
		return customer2;
	}

}
