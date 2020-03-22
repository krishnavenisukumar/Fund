package com.fundtransfer.exception;

public class TransferLimitExceedException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransferLimitExceedException(String TransferAmountExceeded) {
		super(TransferAmountExceeded);

	}

}
