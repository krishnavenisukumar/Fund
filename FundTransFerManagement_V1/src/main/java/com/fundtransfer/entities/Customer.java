package com.fundtransfer.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer")

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;
	private String Customer_name;
	private String Customer_address;
	private String Customer_email;
	private Long Customer_contact;
	private Boolean isEligible;

	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Account> accountList = new ArrayList<Account>();

	public void addAccountList(Account account) {
		accountList.add(account);
		account.setCustomer(this);
	}

	public Customer() {
		super();

	}

	public Customer(String customer_name, String customer_address, String customer_email, Long customer_contact,
			Boolean isEligible) {
		super();
		Customer_name = customer_name;
		Customer_address = customer_address;
		Customer_email = customer_email;
		Customer_contact = customer_contact;
		this.isEligible = isEligible;
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

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

}
