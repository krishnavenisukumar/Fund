package com.fundtransfer.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customers_table")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Customer_name;
	private String Customer_address;
	private String Customer_email;
	private String Customer_contact;
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Account> account = new ArrayList<Account>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public Customer(String customer_name, String customer_address, String customer_email, String customer_contact) {
		super();
		Customer_name = customer_name;
		Customer_address = customer_address;
		Customer_email = customer_email;
		Customer_contact = customer_contact;

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Customer_name=" + Customer_name + ", Customer_address=" + Customer_address
				+ ", Customer_email=" + Customer_email + ", Customer_contact=" + Customer_contact + "]";
	}

	public Customer() {
		super();

	}

}
