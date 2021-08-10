package com.capgemini.assignment.Day10;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayList_Customer_MainClass {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final String regCustID = "^[0-9]+";
	private static final String regCustName = "^[A-Za-z]{1,}";
	private static final String regCustAge = "^[0-9]+";
	private static final String regCustEmail = "^[A-Za-z0-9._$+]{2,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$";
	private static final String regCustContact = "^[0-9]{10}";
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList_CustomerClass> custList = new ArrayList<ArrayList_CustomerClass>();
		Iterator<ArrayList_CustomerClass> custItr;
		int choice = 1, num, i, custID, custAge = 1;
		String custName, custEmail, custMobileNum, temp;
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
							custMobileNum = sc.next();
							while(! (Pattern.matches(regCustContact, custMobileNum))) {
								System.out.print("Wrong input! Contact number must have \n10 total digits.\n"
												+ "Enter valid customer Contact Number\t: ");
								custMobileNum = sc.next();	
							}
							//------------------------------------------------------------------------------------------------------------
							
							custList.add(new ArrayList_CustomerClass(custID, custName, custAge, custDOB, custEmail, custMobileNum));
						}
						break;
			case 2:		System.out.println("Listing of all the Customers in the Database: ");
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							ArrayList_CustomerClass cc = custItr.next();
							System.out.println("-----------------------------------");
							System.out.println("Customer ID\t: " + cc.getCustID());
							System.out.println("Customer Name\t: " + cc.getCustName());
							System.out.println("Customer Age\t: " + cc.getCustAge());
							System.out.println("Customer DOB\t: " + sdf.format(cc.getCustDOB()));
							System.out.println("Customer Email\t: " + cc.getCustEmail());
							System.out.println("Customer Contact: " + cc.getCustMobileNum());
						}
						System.out.println("-----------------------------------");
						break;
			case 3:		System.out.println("Enter the Customer ID to view the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							ArrayList_CustomerClass cc = custItr.next();
							if(cc.getCustID() == custID) {
								System.out.println("-----------------------------------");
								System.out.println("Customer ID\t: " + cc.getCustID());
								System.out.println("Customer Name\t: " + cc.getCustName());
								System.out.println("Customer Age\t: " + cc.getCustAge());
								System.out.println("Customer DOB\t: " + sdf.format(cc.getCustDOB()));
								System.out.println("Customer Email\t: " + cc.getCustEmail());
								System.out.println("Customer Contact: " + cc.getCustMobileNum());
								break;
							}
						}
						System.out.println("-----------------------------------");
						break;
			case 4:		System.out.println("Enter the Customer ID to update the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							ArrayList_CustomerClass cc = custItr.next();
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
								custMobileNum = sc.next();
								while(! (Pattern.matches(regCustContact, custMobileNum))) {
									System.out.print("Wrong input! Contact number must have \n10 total digits.\n"
													+ "Enter valid customer Contact Number\t: ");
									custMobileNum = sc.next();	
								}
								//------------------------------------------------------------------------------------------------------------
								
							break;
							}
						}
						System.out.println("-----------------------------------");
						break;
			case 5:		System.out.println("Enter the Customer ID to remove the details: "); custID = sc.nextInt();
						custItr = custList.iterator();
						while(custItr.hasNext()) {
							ArrayList_CustomerClass cc = custItr.next();
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
}
