package com.global.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.global.model.Book;
import com.global.service.BookServiceImp;

@RestController
public class BookController {
	
	@Autowired
	BookServiceImp bookServiceImp;
	
	@PostMapping("/addBook")
	public void addBook(@RequestBody Book book) {
		bookServiceImp.addBook(book);
	}
	
	@GetMapping("/findall")
	public HashSet<Book> getAllBook(){
		return bookServiceImp.findAllBook();
	}
	
	@DeleteMapping("/delete")
	public void deleteBook() {
		bookServiceImp.deleteAllData();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public void deleteBookByid(@PathVariable Integer id) {
		bookServiceImp.deleteById(id);
	}
}
