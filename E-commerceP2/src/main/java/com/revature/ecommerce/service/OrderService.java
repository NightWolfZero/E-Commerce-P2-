package com.revature.ecommerce.repository;

import com.revature.ecommerce.model.Orders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository or;
	
	public List<Orders> getAllOrders(){
		List<Orders> getAllOrders = new ArrayList<>();
		or.findAll().forEach(getAllOrders::add);
		
		return getAllOrders;
	}
	
	public void addOrder(Orders order) {
		or.save(order);
	}
}
