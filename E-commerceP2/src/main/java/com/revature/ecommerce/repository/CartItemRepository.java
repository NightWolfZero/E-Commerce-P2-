package com.revature.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
 //Need to target CartItem's PK somehow possibly eg. JpaRepository<CartItem, CartItemPK>

}
