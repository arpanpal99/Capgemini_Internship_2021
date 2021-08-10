package com.capgemini.vendormanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.vendormanagementsystem.entity.Vendor;

@Repository
public interface IVendorRepository extends JpaRepository<Vendor, Integer>{
	
	public List<Vendor> findByVendorsByCategory(String category);
	
	public List<Vendor> findByVendorsByType(String type);
	
	public List<Vendor> findByVendorsByName(char name);
	
	public List<Vendor> findByVendorsByMobileNo(int mobileNo);
}
