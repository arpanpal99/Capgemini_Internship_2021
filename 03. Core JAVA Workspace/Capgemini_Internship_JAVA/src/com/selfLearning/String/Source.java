package com.selfLearning.String;

class Operator {
	
	private String name;
	private String ssn;
	private String dept;
	private int salary;
	public Operator(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}


	@Override
	public String toString() {
		return "Operator{";
		// Fill this with the existing code from editorial
	}
}
class OperatorImplementation {
	
	public Operator getOperatorInfo(String str) {
		String[] name = str.split("@");
		String[] ssn = name[1].split("-");
		String[] dept = ssn[1].split("#");
		return new Operator(name[0], ssn[0], dept[0], Integer.parseInt(dept[1]));
	}
	
	public String getOperatorLevel(Operator e) {
		int level = Integer.parseInt(e.getSsn().substring(e.getSsn().length() - 3));
		if		(level > 50 && level <= 100) 	return "L1";
		else if (level > 100 && level <= 150)	return "L2";
		else if	(level > 150 && level <= 200) 	return "L3";
		else if	(level > 200 && level <= 250)	return "L4";
		else return "NA";
	}
}

public class Source {

}
