package com.fundtransfer.dto;

import com.fundtransfer.entities.Transaction;

public class TransactionDto {
	private Long fromAcc;
	private Long toAcc;
	private Double amount;

	public TransactionDto() {
		super();

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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
