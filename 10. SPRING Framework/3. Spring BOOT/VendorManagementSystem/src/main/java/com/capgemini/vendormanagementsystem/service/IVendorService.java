package com.capgemini.vendormanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.vendormanagementsystem.entity.Vendor;

@Service
public interface IVendorService {

	public List<Vendor> getAllVendors();

	public Vendor getVendorById(int id);

	public Vendor addVendor(Vendor vendor);

	public Vendor updateVendor(Vendor vendor, int vendorid);

	public ResponseEntity<Vendor> deleteVendor(int id);

	public List<Vendor> findByVendorsByCategory(String category);

	public List<Vendor> findByVendorsByType(String type);

	public List<Vendor> findByVendorsByName(char name);

	public List<Vendor> findByVendorsByMobileNo(int mobileNo);

}
