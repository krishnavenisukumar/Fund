package com.fundtransfer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundtransfer.entities.AccountTransaction;
@Repository
public interface AccountTransactionRepo extends JpaRepository<AccountTransaction, Long> {
	List<AccountTransaction> findByAccountAccountNumber(Long accountNumber);

}
