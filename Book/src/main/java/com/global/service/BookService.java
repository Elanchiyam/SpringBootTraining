package com.global.service;

import java.util.HashSet;

import com.global.model.Book;

public interface BookService {
	public HashSet<Book> findAllBook();
	public Book findBookByID(Integer id);
	public Book addBook(Book b);
	public void deleteAllData();
	public void deleteById(Integer id);
	
}
