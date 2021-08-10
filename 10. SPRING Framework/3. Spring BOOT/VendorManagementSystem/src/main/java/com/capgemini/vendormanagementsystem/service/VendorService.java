package com.capgemini.vendormanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.vendormanagementsystem.entity.Vendor;
import com.capgemini.vendormanagementsystem.exception.VendorNotFoundException;
import com.capgemini.vendormanagementsystem.repository.IVendorRepository;

@Service
public class VendorService implements IVendorService{

	@Autowired
	private IVendorRepository vendorRepository;

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return this.vendorRepository.findAll();
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findById(id).orElseThrow(() -> new VendorNotFoundException("Vendor not found with id "+ id));
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return this.vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor,int vendorid) {
		// TODO Auto-generated method stub
		Vendor existingVendor = this.vendorRepository.findById(vendorid).orElseThrow(() -> new VendorNotFoundException("Vendor not found with id "+ vendorid));
		existingVendor.setVenCategory(vendor.getVenCategory());
		existingVendor.setVenType(vendor.getVenType());
		existingVendor.setVenMobileNo(vendor.getVenMobileNo());
		existingVendor.setVenEmailId(vendor.getVenEmailId());
		return this.vendorRepository.save(existingVendor);
	}

	@Override
	public ResponseEntity<Vendor> deleteVendor(int id) {
		// TODO Auto-generated method stub
		Vendor existingVendor = this.vendorRepository.findById(id).orElseThrow(() -> new VendorNotFoundException("Vendor not found with id "+ id));
		this.vendorRepository.delete(existingVendor);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Vendor> findByVendorsByCategory(String category) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findByVendorsByCategory(category);
	}

	@Override
	public List<Vendor> findByVendorsByType(String type) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findByVendorsByType(type);
	}

	@Override
	public List<Vendor> findByVendorsByName(char name) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findByVendorsByName(name);
	}

	@Override
	public List<Vendor> findByVendorsByMobileNo(int mobileNo) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findByVendorsByMobileNo(mobileNo);
	}
		
}
