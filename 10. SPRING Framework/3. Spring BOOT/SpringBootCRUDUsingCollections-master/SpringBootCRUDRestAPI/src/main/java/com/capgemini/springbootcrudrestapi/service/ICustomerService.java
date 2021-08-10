package com.capgemini.springbootcrudrestapi.service;

import java.util.List;

import com.capgemini.springbootcrudrestapi.model.Customer;

public interface ICustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public Customer addCustomer(Customer customer);
	public Customer deleteCustomer(int id);
	public Customer updateCustomer(Customer customer);

}
