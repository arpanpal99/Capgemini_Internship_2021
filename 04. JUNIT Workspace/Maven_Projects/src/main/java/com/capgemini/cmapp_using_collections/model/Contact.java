package com.capgemini.cmapp_using_collections.model;

public class Contact {
	private String fName;
	private String lName;
	private String phNo;

	public Contact(String fName, String lName, String phNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phNo = phNo;
	}

	public Contact() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * 
	 * @param fName
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * 
	 * @return
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * 
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhNo() {
		return phNo;
	}

	/**
	 * 
	 * @param phNo
	 */
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((phNo == null) ? 0 : phNo.hashCode());
		return result;
	}

	/* override the method equals */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phNo == null) {
			if (other.phNo != null)
				return false;
		} else if (!phNo.equals(other.phNo))
			return false;
		return true;
	}

	/**
	 * Validate first name
	 */

	public void validateFirstNAme() {
		// TODO Auto-generated method stub
		if (this.fName.isEmpty()) {
			throw new RuntimeException("First name cannot be null or empty");
		}

	}

	/**
	 * Validate Last name
	 */

	public void validateLastNAme() {
		// TODO Auto-generated method stub
		if (this.lName.isEmpty()) {
			throw new RuntimeException("Last name cannot be null or empty");
		}

	}

	/**
	 * Validate phone No
	 */

	public void validatePhoneNo() {
		// TODO Auto-generated method stub

		if (this.phNo.isEmpty()) {
			throw new RuntimeException("phone no cannot be null or empty");
		}
		if (this.phNo.length() != 11) {
			throw new RuntimeException("phone no should be 10 digit long");
		}
		if (!this.phNo.matches("\\d+")) {
			throw new RuntimeException("phone numbber can contain only digits");
		}
		if (!this.phNo.startsWith("0")) {
			throw new RuntimeException("ph no should start eith 0");
		}

	}

	@Override

	/**
	 * @return
	 */
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phNo=" + phNo + "]";
	}

}