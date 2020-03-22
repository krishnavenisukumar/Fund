package com.fundtransfer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@SequenceGenerator(name = "accountsequence", initialValue = 1234567, allocationSize = 1)
@Table(name = "account")

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountsequence")
	private Long accountNumber;
	private String ifsc;
	private Boolean active;
	private Double balance;
	private AccountType accountType;

	@ManyToOne
	private Customer customer;

	public Account() {
		super();
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(String ifsc, Boolean active, Double balance, AccountType accountType) {
		super();
		this.ifsc = ifsc;
		this.active = active;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifsc=" + ifsc + ", active=" + active + ", balance="
				+ balance + ", accountType=" + accountType + ", customer=" + customer + "]";
	}

}
