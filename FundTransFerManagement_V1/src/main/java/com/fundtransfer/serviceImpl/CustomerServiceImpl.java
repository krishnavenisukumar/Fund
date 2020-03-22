package com.fundtransfer.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundtransfer.entities.Customer;
import com.fundtransfer.repo.CustomerRepo;
import com.fundtransfer.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Customer> getAllCustomer() {

		return customerRepo.findAll();
	}

}
