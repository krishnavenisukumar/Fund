package com.fundtransfer.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundtransfer.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
