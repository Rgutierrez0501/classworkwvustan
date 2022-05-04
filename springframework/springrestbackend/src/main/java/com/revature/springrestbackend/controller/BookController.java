package com.revature.springrestbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springrestbackend.entity.Book;
import com.revature.springrestbackend.service.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	@Autowired
	BookService bookService;
	//http://localhost:8080/api/v1/books
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getBooks();
	}
	
	//http://localhost:8080/api/v1/book/1
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable Integer id){
		return bookService.getBook(id);
	}
	
	//http://localhost:8080/api/v1/addBook
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
}
