package com.webvision.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
