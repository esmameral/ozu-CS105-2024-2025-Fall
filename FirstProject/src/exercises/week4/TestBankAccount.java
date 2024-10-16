package exercises.week4;

public class TestBankAccount {

	public static void main(String[] args) {
//		BankAccount account1=new BankAccount();
//		System.out.println(account1.getOwner());
//		System.out.println(account1.getBalance());
//		System.out.println(account1.getAccountId());
//		account1.withdraw(10);
//		account1.withdraw(50,5);
//		
//		System.out.println(account1.getBalance());
//		
//		BankAccount account2=new BankAccount("SUDE",200,988);
//		System.out.println(account2.getOwner());
//		System.out.println(account2.getBalance());
//		System.out.println(account2.getAccountId());
//		account2.deposit(300);
//		System.out.println(account2.getBalance());
		
		
		BankAccount account3=new BankAccount("EMRE");
		System.out.println("Account3");
		System.out.println(account3.getOwner());
		System.out.println(account3.getAccountId());
		account3.setAccountId(56);
		System.out.println(account3.getAccountId());

		System.out.println(account3.getBalance());
		
		System.out.println(account3);
		
		
		

	}

}
