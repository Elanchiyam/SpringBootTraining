package com.global.jwt.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.global.jwt.api.entity.User;

public interface UserRepository extends MongoRepository<User,Integer> {
    User findByUserName(String username);
}
