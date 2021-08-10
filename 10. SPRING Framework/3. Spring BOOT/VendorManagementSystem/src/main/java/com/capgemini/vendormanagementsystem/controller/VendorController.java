package com.capgemini.vendormanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vendormanagementsystem.entity.Vendor;
import com.capgemini.vendormanagementsystem.service.IVendorService;

@RestController
@RequestMapping("/api/vendor")
public class VendorController {

	@Autowired
	private IVendorService vendorService;
	
	@GetMapping("/getallvendors")
	public List<Vendor> getAllVendors(){
		return this.vendorService.getAllVendors();
	}
	
	@GetMapping("/getvendorbyid/{venid}")
	public Vendor getVendorById(@PathVariable("venid") int vendorid) {
		return this.vendorService.getVendorById(vendorid);
	}
	
	@PostMapping("/addvendor")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		return this.vendorService.addVendor(vendor);
	}
	
	@PutMapping("/updatevendor/{venid}")
	public Vendor updateVendor(@RequestBody Vendor vendor,@PathVariable("venid") int vendorid) {
		return this.vendorService.updateVendor(vendor, vendorid);
	}
	
	@DeleteMapping("/deletevendor/{venid}")
	public ResponseEntity<Vendor> deleteVendor(@PathVariable("venid") int vendorid) {
		return this.vendorService.deleteVendor(vendorid);
	}
	
	@GetMapping("/getallvendorsbycategory/{venCategory}")
	public List<Vendor> getAllVendorsByCategory(@PathVariable("venCategory") String category){
		return this.vendorService.findByVendorsByCategory(category);
	}
	
	@GetMapping("/getallvendorsbytype/{venType}")
	public List<Vendor> getAllVendorsByType(@PathVariable("venType") String type){
		return this.vendorService.findByVendorsByType(type);
	}
	
	@GetMapping("/getallvendorsbyname/{venName}")
	public List<Vendor> getAllVendorsByName(@PathVariable("venName") char name){
		return this.vendorService.findByVendorsByName(name);
	}
	
	@GetMapping("/getallvendorsbymobileno/{venMobileNo}")
	public List<Vendor> getAllVendorsByMobileNo(@PathVariable("venMobileNo") int mobileNo){
		return this.vendorService.findByVendorsByMobileNo(mobileNo);
	}
}
