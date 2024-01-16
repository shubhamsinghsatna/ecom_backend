package com.tfp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfp.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
