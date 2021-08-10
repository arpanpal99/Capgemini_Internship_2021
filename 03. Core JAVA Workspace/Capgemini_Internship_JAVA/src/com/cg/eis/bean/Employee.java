package com.cg.eis.bean;
import com.cg.eis.exception.*;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		try {
			MainClass.validate(salary);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + id;
		result = prime * result + ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		try {
			MainClass.validate(salary);
			this.salary = salary;
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


}