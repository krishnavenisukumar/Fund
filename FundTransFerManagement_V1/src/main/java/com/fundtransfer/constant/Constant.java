package com.fundtransfer.constant;

import org.springframework.stereotype.Component;

@Component
public class Constant {

	public Constant() {
		super();

	}

	public static final int Minimum_Fund = 500;
	public static final int Transfer_Amount = 25000;
	public static final String Amount_Low = "Insufficient fund";
	public static final String TransferAmountExceeded = "Sorry!! Your transaction limit is exceed";

}
