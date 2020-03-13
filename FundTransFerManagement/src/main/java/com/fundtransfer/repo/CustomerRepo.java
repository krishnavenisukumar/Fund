package com.fundtransfer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundtransfer.entities.Account;
import com.fundtransfer.entities.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	Account findByAccountAccountNumber(Long accountNumber);

}
