package com.cg.lab9_LambdaExp_StreamAPI.Ex3_ValidateCredentials;

import java.util.Scanner;

public class ValidateCred {
	
   public static void main(String[] args) {
	
	   UserDetails u = ()-> {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter username: ");
		   String userName = sc.next();
		   System.out.println("Enter password");
		   String passWord = sc.next();
		   sc.close();
		   if(userName.equals("Arpan") && passWord.equals("6582ab")) return true;
		   return false;
	   };
	   
	   if(u.checkUserName()) {
		   System.out.println("valid user name and password");
	   }else {
		   System.out.println("Invalid credentials");
	   }
   }
}