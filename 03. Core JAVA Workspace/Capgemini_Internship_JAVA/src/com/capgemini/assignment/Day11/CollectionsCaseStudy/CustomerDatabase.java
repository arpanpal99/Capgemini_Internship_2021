package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerDatabase {
	
	static ArrayList<Account> custList = new ArrayList<Account>();
	static Iterator<Account> custItr;
	
	public static void displayCustDatabase(Account cc) {
		System.out.println("Account Type\t: " + cc.getClass().getSimpleName());
		System.out.println("Customer ID\t: " + cc.getCustID());
		System.out.println("Customer Name\t: " + cc.getCustName());
		System.out.println("Customer Age\t: " + cc.getCustAge());
		System.out.println("Customer DOB\t: " + sdf.format(cc.getCustDOB()));
		System.out.println("Customer Email\t: " + cc.getCustEmail());
		System.out.println("Customer Contact: " + cc.getCustMobileNum());
		System.out.println("Customer Balance: " + cc.getBalance());
		System.out.println("-----------------------------------");
	}
	
	
	//=============================================================================================================================================
	// Adding 3 entries automatically in the database
	
	public static void CreateAccount_Automatically() throws ParseException {
		System.out.println("Creating Bank Customer database automatically");
		System.out.println("*********************************************");
		custList.add(new Savings_Account(1001, "Sam", 25, sdf.parse("25/04/1996"), "sam@gmail.com", 6865985669L, 5000));
		custList.add(new Current_Account(1002, "Mark", 29, sdf.parse("05/09/1992"), "mark@gmail.com", 6624791365L, 14500));
		custList.add(new Savings_Account(1003, "Angela", 23, sdf.parse("10/02/1998"), "angela@gmail.com", 8963532145L, 69520));
		custList.add(new Current_Account(1004, "Tony", 32, sdf.parse("21/01/1989"), "tony@gmail.com", 6985411365L, 35210));
		System.out.println("Listing of all the Customers in the Database: ");
		System.out.println("----------------------------------------------");
		custItr = custList.iterator();
		while(custItr.hasNext()) {
			Account cc = custItr.next();
			displayCustDatabase(cc);
		}
	}
	
	
	//=============================================================================================================================================
	// Adding entries manually in the database and validating each input
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final String regCustID = "^[0-9]+";
	private static final String regCustName = "^[A-Za-z]{1,}";
	private static final String regCustAge = "^[0-9]+";
	private static final String regCustEmail = "^[A-Za-z0-9._$+]{2,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$";
	private static final String regCustContact = "^[0-9]{10}";

	public static void CreateAccount_byManualInput() throws ParseException {
		Scanner sc = new Scanner(System.in);
		int choice = 1, num, i, custID, custAge = 1;
		long custMobileNum;
		String custName, custEmail, temp;
		double balance;
		//Date custDOB = new Date();
		while(choice != 6) {
			System.out.print(   "************************************************************\n"
								+ "1. Add new customers to the database\n"
								+ "2. Display all the customers in the database\n"
								+ "3. Display an existing customer by providing customer ID\n"
								+ "4. Update an existing customer details\n"
								+ "5. Remove an existing customer from the database\n"
								+ "6. Press 6 to exit the Portal\n"
								+ "Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("************************************************************");
			switch(choice) {
			
			case 1:		System.out.print("Enter how many customers need to register: "); num = sc.nextInt();
						for(i = 0; i < num; i++) {
							System.out.println("------------------------------------------------");
							System.out.println("* Enter details for customer no. " + (i+1));
							System.out.println("------------------------------------------------");
							
							//------------------------------------------------------------------------------------------------------------
							System.out.print("1. Enter customer ID\t\t\t: "); 				
							temp = sc.next();											
							while(! (Pattern.matches(regCustID, temp) && Integer.parseInt(temp) > 0)) 	{
								System.out.print("Wrong input! Enter customer ID > 0\t: ");
								temp = sc.next();
							}
							custID = Integer.parseInt(temp);
							//------------------------------------------------------------------------------------------------------------
							System.out.print("2. Enter customer Name\t\t\t: ");		
							custName = sc.next();
							while(! Pattern.matches(regCustName, custName)) {
								System.out.print("Wrong input! Only characters are allowed in Name.\nEnter valid customer Name\t\t: ");
								custName = sc.next();
							}
							//------------------------------------------------------------------------------------------------------------
							System.out.print("3. Enter customer age\t\t\t: ");		
							temp = sc.next();
							while(! (Pattern.matches(regCustAge, temp) && Integer.parseInt(temp) > 0 && Integer.parseInt(temp) < 100)) {
								System.out.print("Wrong input! Enter valid Age (0<age<100): ");
								temp = sc.next();
							}
							custAge = Integer.parseInt(temp);
							//------------------------------------------------------------------------------------------------------------
							System.out.print("4. Enter customer DOB (dd/mm/yyyy)\t: ");		
							Date custDOB = sdf.parse(sc.next());
							//------------------------------------------------------------------------------------------------------------
							System.out.print("5. Enter customer Email\t\t\t: ");		
							custEmail = sc.next();	
							while(! Pattern.matches(regCustEmail, custEmail)) {
								System.out.print("Wrong input! Enter valid Email\t\t: ");
								custEmail = sc.next();	
							}
							//------------------------------------------------------------------------------------------------------------
							System.out.print("6. Enter customer Contact\t\t: ");			
							custMobileNum = sc.nextInt();
							while(! (Pattern.matches(regCustContact, String.valueOf(custMobileNum)))) {
								System.out.print("Wrong input! Contact number must have \n10 total digits.\n"
												+ "Enter valid customer Contact Number\t: ");
								custMobileNum = sc.nextLong();	
							}
							//------------------------------------------------------------------------------------------------------------
							System.out.print("7. Enter initial bank balance\t: ");
							balance = sc.nextDouble();
							//------------------------------------------------------------------------------------------------------------
							System.out.println("8. Enter S for SavingsAccount and C for CurrentAccount");
							char ch = sc.next().charAt(0);
							if(ch == 'S' || ch == 's')
								custList.add(new Savings_Account(custID, custName, custAge, custDOB, custEmail, custMobileNum, balance));
							else 
								custList.add(new Current_Account(custID, custName, custAge, custDOB, custEmail, custMobileNum, balance));
						}
						break;
			case 2:		System.out.println("Listing of all the Customers in the Database: ");
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							Account cc = custItr.next();
							displayCustDatabase(cc);
						}
						System.out.println("-----------------------------------");
						break;
			case 3:		System.out.println("Enter the Customer ID to view the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							Account cc = custItr.next();
							if(cc.getCustID() == custID) {
								displayCustDatabase(cc);
								break;
							}
						}
						System.out.println("-----------------------------------");
						break;
			case 4:		System.out.println("Enter the Customer ID to update the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							Account cc = custItr.next();
							if(cc.getCustID() == custID) {
								System.out.println("------------------------------------------------");
								System.out.println("* Enter details for customer with ID: " + custID);
								System.out.println("------------------------------------------------");
								
								//------------------------------------------------------------------------------------------------------------
								System.out.print("1. Enter customer ID\t\t\t: "); 				
								temp = sc.next();											
								while(! (Pattern.matches(regCustID, temp) && Integer.parseInt(temp) > 0)) 	{
									System.out.print("Wrong input! Enter customer ID > 0\t: ");
									temp = sc.next();
								}
								custID = Integer.parseInt(temp);
								//------------------------------------------------------------------------------------------------------------
								System.out.print("2. Enter customer Name\t\t\t: ");		
								custName = sc.next();
								while(! Pattern.matches(regCustName, custName)) {
									System.out.print("Wrong input! Only characters are allowed in Name.\nEnter valid customer Name\t\t: ");
									custName = sc.next();
								}
								//------------------------------------------------------------------------------------------------------------
								System.out.print("3. Enter customer age\t\t\t: ");		
								temp = sc.next();
								while(! (Pattern.matches(regCustAge, temp) && Integer.parseInt(temp) > 0 && Integer.parseInt(temp) < 100)) {
									System.out.print("Wrong input! Enter valid Age (0<age<100): ");
									temp = sc.next();
								}
								custAge = Integer.parseInt(temp);
								//------------------------------------------------------------------------------------------------------------
								System.out.print("4. Enter customer DOB (dd/mm/yyyy)\t: ");		
								Date custDOB = sdf.parse(sc.next());
								//------------------------------------------------------------------------------------------------------------
								System.out.print("5. Enter customer Email\t\t\t: ");		
								custEmail = sc.next();	
								while(! Pattern.matches(regCustEmail, custEmail)) {
									System.out.print("Wrong input! Enter valid Email\t\t: ");
									custEmail = sc.next();	
								}
								//------------------------------------------------------------------------------------------------------------
								System.out.print("6. Enter customer Contact\t\t: ");			
								custMobileNum = sc.nextInt();
								while(! (Pattern.matches(regCustContact, String.valueOf(custMobileNum)))) {
									System.out.print("Wrong input! Contact number must have \n10 total digits.\n"
													+ "Enter valid customer Contact Number\t: ");
									custMobileNum = sc.nextLong();	
								}
								//------------------------------------------------------------------------------------------------------------
								System.out.print("7. Enter initial bank balance\t: ");
								balance = sc.nextDouble();
								//------------------------------------------------------------------------------------------------------------
							break;
							}
						}
						System.out.println("-----------------------------------");
						break;
			case 5:		System.out.println("Enter the Customer ID to remove the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							Account cc = custItr.next();
							if(cc.getCustID() == custID) {
								custItr.remove();
								break;
							}
						}
						System.out.println("Removed customer details with ID: " + custID);
						System.out.println("---------------------------------------");
						break;
			case 6:		System.out.println("********************************************");
						System.out.println("Exiting the CUSTOMER Portal...\nFarewell!");
						break;
			default:	System.out.println("Wrong Choice!");
						break;
			}
		}
	}


	//=============================================================================================================================================
	// Generating ATM Card Automatically
	
	static ArrayList<ATM_Card> atmCardList = new ArrayList<ATM_Card>();
	static Iterator<ATM_Card> atmCardItr;
	static int pinItr = 1230;
	static int cardIdItr = 6523400;
	public static void displayCards(ATM_Card ac) {
		System.out.println("ATM Pin\t\t: " + ac.getPin());
		System.out.println("ATM Card ID\t: " + ac.getCardID());
		System.out.println("Customer ID\t: " + ac.getCustID());
		System.out.println("Customer Name\t: " + ac.getCustName());
		System.out.println("Customer Age\t: " + ac.getCustAge());
		System.out.println("Customer DOB\t: " + sdf.format(ac.getCustDOB()));
		System.out.println("Customer Email\t: " + ac.getCustEmail());
		System.out.println("Customer Contact: " + ac.getCustMobileNum());
		System.out.println("Customer Balance: " + ac.getBalance());
		System.out.println("-----------------------------------");
	}
	
	public static void CreateATMCard_Automatically() {
		
		System.out.println("\n\nCreating ATM Card Database automatically");
		System.out.println("****************************************");
		custItr = custList.iterator();
		while(custItr.hasNext()) {
			Account cc = custItr.next();
			atmCardList.add(new ATM_Card(pinItr++, cardIdItr++, cc.getCustID(), cc.getCustName(), cc.getCustAge(), cc.getCustDOB(), cc.getCustEmail(), cc.getCustMobileNum(), cc.getBalance()));			
		}
		System.out.println("Listing all the cards in the ATM Card Database:");
		System.out.println("-----------------------------------------------");
		atmCardItr = atmCardList.iterator();
		while(atmCardItr.hasNext()) {
			ATM_Card ac = atmCardItr.next();
			displayCards(ac);
		}
	}
		
}
