package Entities;

public class Account {

	private int accountNumber;
	private String holderName;
	private double balance;

	//// Constructor	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	
 
	public Account(int accountNumber, String holderName, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		balance += amount;	
	}

	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account " + getAccountNumber() + ", Holder Name: " + getHolderName() + ", Balance: " + String.format("%.2f", getBalance()); 
	}

}
