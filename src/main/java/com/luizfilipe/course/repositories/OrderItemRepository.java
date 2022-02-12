package com.luizfilipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
