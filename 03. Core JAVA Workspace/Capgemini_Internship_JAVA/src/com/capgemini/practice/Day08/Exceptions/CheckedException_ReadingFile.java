package com.capgemini.practice.Day08.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException_ReadingFile {
	// ExceptionHandlingExamples/src/sample.txt
	public void readFile() throws IOException, FileNotFoundException {
		FileReader file = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(file);
		for (int i = 0; i < 3; i++) {
			System.out.println(br.readLine());
		}

		file.close();
	}

}