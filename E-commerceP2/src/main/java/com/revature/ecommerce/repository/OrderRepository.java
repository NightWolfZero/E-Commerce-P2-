package com.revature.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.revature.ecommerce.model.Orders;

@CrossOrigin
public interface OrderRepository extends JpaRepository<Orders, Long>{
	
	
	List<Orders>getOrdersByCustomerUserName(String username);
	List<Orders>getAllOrders();
	
}
