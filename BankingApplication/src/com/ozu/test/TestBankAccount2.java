package com.ozu.test;

import com.ozu.model.BankAccount;
import com.ozu.model.BillPayment;
import com.ozu.model.DepositTransaction;
import com.ozu.model.InsufficientBalanceException;
import com.ozu.model.WithdrawalTransaction;

public class TestBankAccount2 {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("Jim", 123);

		try {
			System.out.println(account);
			DepositTransaction tr1=new DepositTransaction(1000);
			account.post(tr1);
			System.out.println(account);
			
			WithdrawalTransaction tr2=new WithdrawalTransaction(600);
			account.post(tr2);
			System.out.println(account);
			
			BillPayment tr3=new BillPayment(500);
			account.post(tr3);
			System.out.println(account);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.toString());
		}
		 catch (Exception e) {
				System.out.println(e.toString());
		}finally {
			System.out.println("Completed");
		}
		
		
		

	}

}
