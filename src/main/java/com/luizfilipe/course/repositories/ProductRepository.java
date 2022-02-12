package com.luizfilipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
