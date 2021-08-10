package com.cg.lab8_MultiThreading.CopyDataThread;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {

		// To get the address of the Eclipse Java Project named "Capgemini_Internship_Java"
		// This will vary from machine to machine. 
		// But the package structure under this parent directory will be the same.
		String currentDir = System.getProperty("user.dir");
		
		File sm_source=new File(currentDir + "\\src\\com\\cg\\lab8_MultiThreading\\CopyDataThread\\source.txt"); 
		File sm_target=new File(currentDir + "\\src\\com\\cg\\lab8_MultiThreading\\CopyDataThread\\target.txt"); 
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}

}