package com.fundtransfer.entities;

import java.time.LocalDateTime;

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
	private LocalDateTime timeStamp;
	private Long fromAcc;
	private Long toAcc;
	private String txType;
	private Double amount;
	private String status;// Approved, pending

	public Transaction() {
		super();

	}

	public Transaction(Long fromAcc, Long toAcc, String txType, Double amount, String status) {
		this.timeStamp = LocalDateTime.now();
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.txType = txType;
		this.amount = amount;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(Long fromAcc) {
		this.fromAcc = fromAcc;
	}

	public Long getToAcc() {
		return toAcc;
	}

	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
