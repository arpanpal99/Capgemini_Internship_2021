package com.cg.lab3_Strings_Parsing;

import java.time.*;
import java.util.Scanner;

public class L3G_Duration {

	static void duration(String str) {

		String[] date = str.split("[-./]+");

		LocalDate userDate = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]),
				Integer.parseInt(date[0]));
		LocalDate today = LocalDate.now();

		Period per = Period.between(userDate, today);

		int days = per.getDays();
		int months = per.getMonths();
		int years = per.getYears();

		if (days < 0 || months < 0 || years < 0)
			System.out.println("\nRemaining " + Math.abs(days) + " days, " + Math.abs(months) + " months and "
					+ Math.abs(years) + " years " + "\nto reach the above date from today.");
		else
			System.out.println("\nAbove date is " + Math.abs(days) + " days, " + Math.abs(months) + " months and "
					+ Math.abs(years) + " years " + "\nbefore today.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any previous or upcoming date\n(Format: dd-mm-yyyy or dd.mm.yyyy or dd/mm/yyyy)");

		duration(sc.nextLine());
		sc.close();
	}

}
