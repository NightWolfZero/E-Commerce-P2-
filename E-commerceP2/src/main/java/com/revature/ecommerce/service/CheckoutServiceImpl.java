package com.revature.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ecommerce.dto.Purchase;
import com.revature.ecommerce.dto.PurchaseResponse;
import com.revature.ecommerce.model.Orders;
import com.revature.ecommerce.repository.CustomerRepository;

@Service
public class CheckoutServiceImpl {

	private CustomerRepository customerRepository;
	
	@Autowired
	public CheckoutServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		
		//To retrieve order info from DTO
		Orders order = purchase.getOrder();
	}
}
