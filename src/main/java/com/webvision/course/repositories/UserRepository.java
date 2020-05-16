package com.webvision.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
