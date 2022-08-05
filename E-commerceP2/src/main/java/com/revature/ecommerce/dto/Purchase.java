package com.revature.ecommerce.dto;

import com.revature.ecommerce.model.Orders;
import com.revature.ecommerce.model.Users;

import lombok.Data;

@Data
public class Purchase {

	private Users customer;
	
	//private BillingAddress billingAddress;
	
	//private ShippingAddress shippingAddress;
	
	private Orders order;

}
