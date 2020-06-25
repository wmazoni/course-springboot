package com.webvision.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
