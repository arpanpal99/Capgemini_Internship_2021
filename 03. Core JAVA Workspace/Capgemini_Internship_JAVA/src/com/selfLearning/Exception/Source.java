package com.selfLearning.Exception;

class Activity {

	String string1, string2, operator;

	public Activity(String s1, String s2, String op) {
		
		this.string1 = s1;
		this.string2 = s2;
		this.operator = op;

	}
}

public class Source {

	public String handleException(Activity a) {
		String rs = "No Exception Found";
		try {
			if (a.string1 == null || a.string2 == null) {
				throw new NullPointerException();
			}
			if (a.operator != "+" && a.operator != "-") {
				throw new Exception();
			}
		} catch (NullPointerException e) {
			rs = "Null values found";
		} catch (Exception e) {
			rs = a.operator;
		}

		return rs;
	}

	public String doOperation(Activity a) {
		String oper = a.operator;
		String s1 = a.string1;
		String s2 = a.string2;
		String res = "";
		switch (oper) {
		case "+":
			return s1 + s2;

		case "-":
			return s1.replaceAll(s2, "");

		}
		return null;
	}

	public static void main(String args[]) throws Exception {
		// Write your own main to check the program...
	}
}