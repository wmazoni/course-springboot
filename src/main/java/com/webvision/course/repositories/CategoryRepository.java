package com.webvision.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
