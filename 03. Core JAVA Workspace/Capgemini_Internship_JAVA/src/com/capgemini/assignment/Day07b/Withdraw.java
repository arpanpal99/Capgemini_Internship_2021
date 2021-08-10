package com.capgemini.assignment.Day07b;

public class Withdraw extends Transaction {

	Withdraw() {
		System.out.println("\n*************************************************\n"
				+ "Welcome to WITHDRAWAL portal of our bank\n" + "*************************************************");
	}

	public void execute(int amount) {
		int i;
		for (i = 0; i < 10; i++)
			if (getAccountNumber() == Transaction.accntDetails[i][0])
				break;

		System.out.println("------------------------------------------------");
		System.out.println("* Earlier account balance: $" + Transaction.accntDetails[i][1]);
		Transaction.accntDetails[i][1] -= amount;
		System.out.println("* Withdrawn $" + amount + " from account number " + getAccountNumber());
		System.out.println("* Your current bank balance: $" + Transaction.accntDetails[i][1]);
		System.out.println("------------------------------------------------");

	}
}
