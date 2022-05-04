package com.revature.springrestbackend.service;

import java.util.List;

import com.revature.springrestbackend.entity.Book;

public interface BookService {

	public List<Book> getBooks();
	public Book getBook(Integer id);
	public Book addBook(Book book);
	public void deleteBook(Integer id);
	public Book updateBook(Book book);
	public Book getBookByName(String name);
	
}
