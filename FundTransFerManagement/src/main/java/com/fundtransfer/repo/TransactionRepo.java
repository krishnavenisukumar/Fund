package com.fundtransfer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundtransfer.entities.Transaction;
@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
	List<Transaction> findByfromAcc(Long fromAcc);
}
