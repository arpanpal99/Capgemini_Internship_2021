package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.text.ParseException;

public class MainClass {

	public static void main(String[] args) throws ParseException { 	
		
		/**
		 * This command creates 4 different types of sample Bank Accounts
		 * with system generated details.
		 */
		CustomerDatabase.CreateAccount_Automatically(); 
		
		
		
		/**
		 * This command is used to create a Savings Account 
		 * by entering each entries MANUALLY, 
		 * and by validating each input by pre-defined Regex.
		 */
		//CustomerDatabase.CreateAccount_byManualInput(); 
		
		
		
		/**
		 * This command assigns system generated ATM Pin and ATM Card ID 
		 * to each existing bank customer in the Customer Database
		 */
		CustomerDatabase.CreateATMCard_Automatically();		 
		
		
		/**
		 * This command is used to start depositing and withdrawing money 
		 * from an user-specified Bank Account in the Database
		 */
		Transaction.Start();								
	}
}
