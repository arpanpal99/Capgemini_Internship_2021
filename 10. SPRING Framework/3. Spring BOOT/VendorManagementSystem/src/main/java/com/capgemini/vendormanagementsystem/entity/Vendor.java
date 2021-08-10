package com.capgemini.vendormanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vendortable")
public class Vendor {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "vendor_Sequence")
    @SequenceGenerator(name = "vendor_Sequence", sequenceName = "VENDOR_SEQ")
	private int venId;
	
	@Column(name = "vendorname")
	private String venName;
	
	@Column(name = "vendormobileno")
	private int venMobileNo;
	
	@Column(name = "vendortype")
	private String venType;
	
	@Column(name = "vendorcategory")
	private String venCategory;
	
	@Column(name = "vendoremailid")
	private String venEmailId;
	
	public Vendor() {
		super();
	}
	public Vendor(String venName, int venMobileNo, String venType, String venCategory, String venEmailId) {
		super();
		this.venName = venName;
		this.venMobileNo = venMobileNo;
		this.venType = venType;
		this.venCategory = venCategory;
		this.venEmailId = venEmailId;
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public int getVenMobileNo() {
		return venMobileNo;
	}
	public void setVenMobileNo(int venMobileNo) {
		this.venMobileNo = venMobileNo;
	}
	public String getVenType() {
		return venType;
	}
	public void setVenType(String venType) {
		this.venType = venType;
	}
	public String getVenCategory() {
		return venCategory;
	}
	public void setVenCategory(String venCategory) {
		this.venCategory = venCategory;
	}
	public String getVenEmailId() {
		return venEmailId;
	}
	public void setVenEmailId(String venEmailId) {
		this.venEmailId = venEmailId;
	}
	
}
