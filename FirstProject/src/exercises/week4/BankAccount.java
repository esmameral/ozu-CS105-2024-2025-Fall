package exercises.week4;

public class BankAccount {

	private String owner="Zeynep";
	private int accountId=123;
	private double balance=100;
	
	public BankAccount() {
		this.owner="Hasan";
	}
	
	public BankAccount(String ownerName) {
		this.owner=ownerName;
	}
	
	public BankAccount(String ownerName, double balance, int accountId ) {
		
		this(ownerName);//calls BankAccount(string) constructor
//		this.owner=ownerName;
		this.accountId=accountId;
		this.balance=balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	
	public void setAccountId(int newId) {
		this.accountId=newId;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		//balance=balance-amount;
		setBalance(balance-amount);
	}
	public void withdraw(double amount, double fee) {
		balance=balance-amount-fee;
	}
	public void deposit(double amount) {
		balance=balance+amount;

	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", accountId=" + accountId + ", balance=" + balance + "]";
	}

	
	
	
//	public String toString() {
//		return "Owner:"+this.owner+" ID:"+this.accountId+" Balance:"+this.balance;
//	}
}


