package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

public class SavingsAccount implements Account {

	@Override
	public void CalculateInterest() {
		
		System.out.println((double)(balance * 0.075));
		
	}

}
