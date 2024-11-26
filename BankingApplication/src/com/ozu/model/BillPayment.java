package com.ozu.model;

public class BillPayment extends WithdrawalTransaction {
	public static double FEE=15; 

	public BillPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		setAmount(FEE+getAmount());
		super.updateAccount(acc);
		
	}
	
	

}
