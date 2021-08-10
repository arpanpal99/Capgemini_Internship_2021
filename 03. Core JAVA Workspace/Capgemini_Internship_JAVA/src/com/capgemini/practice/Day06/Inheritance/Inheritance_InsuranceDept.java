package com.capgemini.practice.Day06.Inheritance;

public class Inheritance_InsuranceDept extends Inheritance_Employee {

	private float insuranceEligibility = 50000;
	private float insuranceAmtClaimed;

	public void readInsuranceDetails() {
		System.out.println("Enter insuranceAmtClaimed");
		insuranceAmtClaimed = sc.nextFloat();
	}

	public void checkInsuranceEligibility() {
		if (insuranceAmtClaimed > insuranceEligibility) {
			System.out.println("Amount Claimed Exceeded");
		} else {
			System.out.println("Amount Claimed = " + (insuranceEligibility - insuranceAmtClaimed));
		}
	}
}
