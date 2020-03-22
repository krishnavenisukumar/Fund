package com.fundtransfer.dto;

import com.fundtransfer.entities.AccountType;

public class AccountDto {

	private Double balance;
	private String ifsc;
	private Boolean active;
	private AccountType accountType;
	private Long customer_id;
	private String Customer_name;
	private String Customer_address;
	private String Customer_email;
	private Long Customer_contact;
	private Boolean isEligible;

	public AccountDto() {
		super();
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
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

	public Long getCustomer_contact() {
		return Customer_contact;
	}

	public void setCustomer_contact(Long customer_contact) {
		Customer_contact = customer_contact;
	}

	public Boolean getIsEligible() {
		return isEligible;
	}

	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}

}
