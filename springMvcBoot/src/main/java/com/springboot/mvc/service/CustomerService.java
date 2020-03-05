package com.springboot.mvc.service;

import java.util.List;

import com.springboot.mvc.entity.customer;
import com.springboot.mvc.exception.ResourceNotFoundException;

public interface CustomerService {

	public List < customer > getCustomers();
	public void saveCustomer (customer theCustomer);
	public customer getCustomer (int theId) throws ResourceNotFoundException;
	public void deleteCustomer (int theId) throws ResourceNotFoundException;

}
