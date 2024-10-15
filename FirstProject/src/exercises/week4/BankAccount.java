package exercises.week4;

public class BankAccount {

	private String owner="Zeynep";
	private int accountId=123;
	private double balance=100;
	
	public BankAccount() {
		owner="Hasan";
	}
	
	public BankAccount(String ownerName) {
		owner=ownerName;
	}
	
	public BankAccount(String ownerName, double balance, int accountId ) {
		this.owner=ownerName;
		this.accountId=accountId;
		this.balance=balance;
	}
	public String getOwner() {
		return owner;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	public void withdraw(double amount, double fee) {
		balance=balance-amount-fee;
	}
	public void deposit(double amount) {
		balance=balance+amount;

	}
	
}


