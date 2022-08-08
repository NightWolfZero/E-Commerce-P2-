package com.revature.ecommerce.repository;

import com.revature.ecommerce.model.Orders;
import com.revature.ecommerce.repository.OrderService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService os;
	
	@RequestMapping("/orders")
	public List<Orders> showAllOrders(){
		return os.getAllOrders();
	}
	
	@RequestMapping(value="/addOrder", method=RequestMethod.POST)
	public void addOrder(@RequestBody Orders orders) {
		os.addOrder(orders);
	}
}
