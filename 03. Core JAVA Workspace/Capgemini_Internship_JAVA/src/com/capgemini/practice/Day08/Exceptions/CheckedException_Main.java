package com.capgemini.practice.Day08.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException_Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		// ReadingAFile raf = new ReadingAFile();
		// raf.readFile();

		CheckedException_Division div = new CheckedException_Division();
		div.divide();
	}

}