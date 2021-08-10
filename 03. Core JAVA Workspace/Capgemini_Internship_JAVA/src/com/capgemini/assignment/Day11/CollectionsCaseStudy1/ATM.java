package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

import java.util.Scanner;

public interface ATM {

	static Scanner sc = new Scanner(System.in);
	public String location = "";
	public String branchName = "";
	
	public static String Show() {
		//System.out.println("The branch named '" + branchName + "' is located at " + location);
		return ("The branch named '" + branchName + "' is located at " + location);
	}
}
