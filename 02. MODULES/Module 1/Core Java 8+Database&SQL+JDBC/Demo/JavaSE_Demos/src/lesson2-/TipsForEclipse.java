package com.capgemini.lesson2;

public class 
TipsForEclipse {

	/* Task 1:  to format this class use Ctrl + Shift + F key combination*/
	private 
	int 
	employeeId;
	private 
	String firstName;
	private String 
	lastName;

	/*Task 2: To remove the compilation error, we need to import LocalDate class
	you can instruct eclipse to do this task, hover the mouse on compilation error
	or select the hint balloon
	eclipse will display all available imports, 
	select the proper import which is java.time
	*/
	
	/*Note:please remove the below comment before you proceed 
	 * Use Ctrl + 7 to complete this task */
	//private LocalDate dateOfJoin;
	
	
	
	/* Task 3:  re-factor the above variable as salary, place the cursor in property name,
	right click and select re-factor -> Rename. When you refactor, eclipse will 
	automatically update all occour ances, do check the printSalary() method which 
	 also uses the sal variable*/
	
	private double 
	sal;
	public void 
	printSalary() {
		System.out.println("Salary Rs." + sal);
	}
	
	/*Task 4: generating getter and setters
	to create getter and setter for the above properties right click anywhere
	 in editor and select Source->Generate getters and setters
	*/
	
	

}
