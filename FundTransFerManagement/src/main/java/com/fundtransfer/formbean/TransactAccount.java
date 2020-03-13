package com.fundtransfer.formbean;

public class TransactAccount {
	private Long fromAcc;
	private Long toAcc;
	private Double amount;

	public TransactAccount() {
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

	public TransactAccount(Long fromAcc, Long toAcc, Double amount) {
		super();
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.amount = amount;
	}

}
