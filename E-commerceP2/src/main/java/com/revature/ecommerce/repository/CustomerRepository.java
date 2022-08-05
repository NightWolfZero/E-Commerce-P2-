package com.revature.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	

}
