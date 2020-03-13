package com.fundtransfer.formbean;

import com.fundtransfer.entities.AccountType;

public class AccountForm {

	private double balance;
	private String ifsc;
	private boolean active;
	private AccountType accountType;
	private String Customer_name;
	private String Customer_address;
	private String Customer_email;
	private String Customer_contact;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	public String getCustomer_address() {
		return Customer_address;
	}

	public void setCustomer_address(String customer_address) {
		Customer_address = customer_address;
	}

	public String getCustomer_email() {
		return Customer_email;
	}

	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}

	public String getCustomer_contact() {
		return Customer_contact;
	}

	public void setCustomer_contact(String customer_contact) {
		Customer_contact = customer_contact;
	}

	public AccountForm(double balance, String ifsc, boolean active, AccountType accountType, String customer_name,
			String customer_address, String customer_email, String customer_contact) {
		super();
		this.balance = balance;
		this.ifsc = ifsc;
		this.active = active;
		this.accountType = accountType;
		Customer_name = customer_name;
		Customer_address = customer_address;
		Customer_email = customer_email;
		Customer_contact = customer_contact;
	}

	public AccountForm() {
		super();

	}

}
