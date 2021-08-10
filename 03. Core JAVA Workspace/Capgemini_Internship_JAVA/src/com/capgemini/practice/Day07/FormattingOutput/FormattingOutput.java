package com.capgemini.practice.Day07.FormattingOutput;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.*;

public class FormattingOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "to play Cricket";
		String hobby = String.format("My favourite hobby is  %s", str);
		System.out.println(hobby);

		float mySalary = 2345.6789123f;
		System.out.println(String.format("my salary = %.8f ", mySalary));
		System.out.println(String.format("my salary = %16.8f ", mySalary));

		int value = 12345;
		System.out.println(String.format("%07d", value));

		System.out.format("Local time: %tT", Calendar.getInstance());

		// Format a string containing a date.

		// Calendar c = new GregorianCalendar(1995, MAY, 23);
		// String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
		// System.out.println(s);

		long n = 461012;
		System.out.format("%d%n", n); // --> "461012"
		System.out.format("%08d%n", n); // --> "00461012"
		System.out.format("%+8d%n", n); // --> " +461012"
		System.out.format("%,8d%n", n); // --> " 461,012"
		System.out.format("%+,8d%n%n", n); // --> "+461,012"

		double pi = Math.PI;

		System.out.format("%f%n", pi); // --> "3.141593"
		System.out.format("%.3f%n", pi); // --> "3.142"
		System.out.format("%10.3f%n", pi); // --> " 3.142"
		System.out.format("%-10.3f%n", pi); // --> "3.142"
		System.out.format(Locale.FRANCE, "%-10.4f%n%n", pi); // --> "3,1416"

		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c); // --> "May 29, 2006"

		System.out.format("%tl:%tM %tp%n", c, c, c); // --> "2:34 am"

		System.out.format("%tD%n", c); // --> "05/29/06"
	}

}
