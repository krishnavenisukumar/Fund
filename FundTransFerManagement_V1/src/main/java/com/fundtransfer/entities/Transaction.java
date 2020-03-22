package com.fundtransfer.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long beneficiaryAccno;
	private String transactionType;
	private LocalDate transaction_Date;
	private Double Amount;
	private Long fromAcc;
	private Boolean Status;

	public Transaction() {
		super();

	}

	public Transaction(Long beneficiaryAccno, String transactionType, LocalDate transaction_Date, Double amount,
			Long fromAcc, Boolean status) {
		super();
		this.beneficiaryAccno = beneficiaryAccno;
		this.transactionType = transactionType;
		this.transaction_Date = transaction_Date;
		Amount = amount;
		this.fromAcc = fromAcc;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBeneficiaryAccno() {
		return beneficiaryAccno;
	}

	public void setBeneficiaryAccno(Long beneficiaryAccno) {
		this.beneficiaryAccno = beneficiaryAccno;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public LocalDate getTransaction_Date() {
		return transaction_Date;
	}

	public void setTransaction_Date(LocalDate transaction_Date) {
		this.transaction_Date = transaction_Date;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public Long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(Long fromAcc) {
		this.fromAcc = fromAcc;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}

}
