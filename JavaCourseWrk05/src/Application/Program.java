package Application;

import java.util.Scanner;

import Entities.Account;

public class Program {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter account number: ");
		int accountNumber = scanner.nextInt();
		Account account;
		
		System.out.println("Enter account holder: ");
		scanner.nextLine();
		String holderName = scanner.nextLine();

		
		
		System.out.println("Initial deposit? \n 1 - YES \n 2 - NO ");
		int option = scanner.nextInt();
		if (option == 1) {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = scanner.nextInt();
			account = new Account(accountNumber, holderName, initialDeposit);
		} else {
			account = new Account(accountNumber, holderName);
		}

		System.out.println();
		System.out.println("Updated data: \n" + account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double amount = scanner.nextDouble();
		account.deposit(amount);
		
		System.out.println();
		System.out.println("Updated data: \n" + account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		amount = scanner.nextDouble();
		account.withdraw(amount);
		
		System.out.println();
		System.out.println("Withdraw tax: $ 5,00");
		
		System.out.println();
		System.out.println("Updated data: \n" + account);
		
		
		
		scanner.close();

	}

}
