package com.springboot.mvc.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.mvc.entity.customer;
import com.springboot.mvc.exception.ResourceNotFoundException;
import com.springboot.mvc.repositories.CustomerRepository;

@Service
public class CustomeServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	 @Transactional
	 public List < customer > getCustomers() {
	        return customerRepository.findAll();
	 }
	 
	@Transactional
	public void saveCustomer(customer theCustomer){
		customerRepository.save(theCustomer);
	}
	
	@Transactional
	 public customer getCustomer(int id) throws ResourceNotFoundException {
        return customerRepository.findById(id).orElseThrow( 
        		() -> new ResourceNotFoundException(id));
    }
	
	@Transactional
	public void deleteCustomer(int theId){
		customerRepository.deleteById(theId);
	}

}
