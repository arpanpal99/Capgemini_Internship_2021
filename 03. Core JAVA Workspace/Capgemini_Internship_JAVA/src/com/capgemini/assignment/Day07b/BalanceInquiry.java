package com.capgemini.assignment.Day07b;

public class BalanceInquiry extends Transaction {

	BalanceInquiry() {
		System.out.println("\n*************************************************\n"
				+ "Welcome to BALANCE ENQUIRY portal of our Bank\n"
				+ "*************************************************");
	}

	public void execute(int acNum) {

		int balance = 0;
		for (int i = 0; i < 10; i++)
			if (acNum == Transaction.accntDetails[i][0])
				balance = (int) (Transaction.accntDetails[i][1]);
		System.out.println("------------------------------------------------");
		System.out.println("* Your available bank balance is: $" + balance);
		System.out.println("------------------------------------------------");
	}

}
