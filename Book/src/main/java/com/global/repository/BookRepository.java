package com.global.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.global.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
