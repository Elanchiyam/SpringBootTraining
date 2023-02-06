package com.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.global.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
