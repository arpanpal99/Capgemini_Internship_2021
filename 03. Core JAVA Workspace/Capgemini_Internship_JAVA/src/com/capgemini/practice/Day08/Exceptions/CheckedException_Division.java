package com.capgemini.practice.Day08.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException_Division {

	public void divide() {
		// TODO Auto-generated method stub
		// here exception if found
		try {
			// code that raised exception will be included inside the try block
			int result = 10 / 0;
			FileReader file = new FileReader("src/sample1.txt");
			BufferedReader br = new BufferedReader(file);
			for (int i = 0; i < 3; i++) {
				System.out.println(br.readLine());
			}

			file.close();

		} catch (ArithmeticException e) {
			System.out.println("-=======================");
			System.out.println("Arithmetic Exception  = " + e.getMessage());
		} catch (IOException e) {
			System.out.println("-=======================");
			System.out.println("IO Exception  = " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// will executed in both cases either while exception or no exception
			// finally block is used to close the connections like
			// file close,db close,scaner close etc.,
			System.out.println("This is fnally block that executes in both cases");
		}

	}

}
