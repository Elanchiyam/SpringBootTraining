package com.global.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.model.Book;
import com.global.repository.BookRepository;

@Service
public class BookServiceImp implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	HashSet<Book> bookList = new HashSet<>();
	
	@Override
	public HashSet<Book> findAllBook() {
		// TODO Auto-generated method stub
		bookRepository.findAll().forEach(books->bookList.add(books));
		return bookList;
	}

	@Override
	public Book findBookByID(Integer id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	@Override
	public Book addBook(Book b) {
		// TODO Auto-generated method stub
		return bookRepository.save(b);
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		bookRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

}
