package com.luizfilipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
