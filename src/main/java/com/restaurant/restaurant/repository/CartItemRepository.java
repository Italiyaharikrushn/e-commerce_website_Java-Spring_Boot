package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}