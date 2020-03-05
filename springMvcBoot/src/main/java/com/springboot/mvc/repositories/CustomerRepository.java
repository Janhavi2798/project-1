package com.springboot.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mvc.entity.customer;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<customer, Integer>{

}
