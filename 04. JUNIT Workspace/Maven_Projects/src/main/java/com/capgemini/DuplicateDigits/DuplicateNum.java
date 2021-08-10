package com.capgemini.DuplicateDigits;

public class DuplicateNum {
	public String[] duplicateNum(int num) {
		int n = num, arr[] = new int[10];
		while (n > 0) {
			int d = n % 10;
			arr[d]++;
			n /= 10;
		}
		int cnt = 0;
		String[] res = new String[10];
		for (int i = 0; i < 10; i++) {
			res[i] = " ";
			if (arr[i] > 1)
				res[cnt++] = "Digit " + i + " is repeated " + arr[i] + " times.";
		}
		if (cnt == 0)
			res[cnt] = "No digit is repeated";
		//res[0] = "WRONG Line! HAHAHAHAHA XD! Program gone crazy ♥☺";
		//res[1] = "Another wrong line!";
		return res;
	}
}