package com.global;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.global.model.Book;
import com.global.repository.BookRepository;
import com.global.service.BookServiceImp;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class BookApplicationTests {
	
	@Test
	void contextLoads() {
	}

	@InjectMocks
	private BookServiceImp bookService;
	
	@Mock
	private BookRepository bookRepository;
	
//	@BeforeAll
//	public void doBeforeTestMethod() {
//		
//	}
//	
//	@AfterAll
//	public void doAfterTestMethod() {
//		
//	}
	
	@Test
	public void findAllBookTest() {
		when(bookRepository.findAll()).thenReturn(Stream.of(
				new Book(120, "Java" , "Complete Reference"),
				new Book(121, "Angular", "Angular Complete Reference"))
				.collect(Collectors.toList()));

		
		assertEquals(2, bookService.findAllBook().size());
	}
	
	@Test
	public void addBooktest() {
		Book book = new Book(121,"C++", "Complete reference");
		when(bookRepository.save(book)).thenReturn(book);
		assertEquals(book, bookService.addBook(book));
	}
	
	@Test
	public void getBookByIdTest() {
		Book book = new Book(5, "C", "Deep C");
		when(bookRepository.findById(book.getId())).
											thenReturn(Optional.of(book));
		
		Book expected = bookService.findBookByID(book.getId());
		
		assertThat(expected).isSameAs(book);
		verify(bookRepository).findById(book.getId());
	}
}
