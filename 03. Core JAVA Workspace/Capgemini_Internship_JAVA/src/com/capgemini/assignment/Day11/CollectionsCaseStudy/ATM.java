package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Scanner;

public class ATM {

	static Scanner sc = new Scanner(System.in);
	private static String location;
	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		ATM.location = location;
	}

	public static String getBranchName() {
		return branchName;
	}

	public static void setBranchName(String branchName) {
		ATM.branchName = branchName;
	}

	private static String branchName;
	
	public String Show() {
		//System.out.println("The branch named '" + branchName + "' is located at " + location);
		return ("The branch named '" + branchName + "' is located at " + location);
	}
}
