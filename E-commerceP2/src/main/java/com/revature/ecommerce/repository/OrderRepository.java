package com.revature.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.revature.ecommerce.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
