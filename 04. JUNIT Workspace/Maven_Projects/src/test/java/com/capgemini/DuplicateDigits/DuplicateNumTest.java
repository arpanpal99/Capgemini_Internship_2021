package com.capgemini.DuplicateDigits;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.capgemini.DuplicateDigits.DuplicateNum;

public class DuplicateNumTest {

	
	DuplicateNum dn = new DuplicateNum();

	@Test
	public void duplicateNumTest() {
		int n = 2525642, arr[] = new int[10], cnt = 0;
		String[] actualStr = dn.duplicateNum(n);
		String[] expectedStr = new String[10];
		while (n > 0) {
			int d = n % 10;
			arr[d]++;
			n /= 10;
		}
		for (int i = 0; i < 10; i++) {
			expectedStr[i] = " ";
			if (arr[i] > 1) {
				expectedStr[cnt] = "Digit " + i + " is repeated " + arr[i] + " times.";
				cnt++;
			}
		}
		if (cnt == 0)
			expectedStr[cnt] = "No digit is repeated";
		// *******************************************************
		boolean res = true;
		int len = expectedStr.length;
		for (int i = 0; i < len; i++)
			assertEquals(expectedStr[i], actualStr[i]);
	}
	
}
