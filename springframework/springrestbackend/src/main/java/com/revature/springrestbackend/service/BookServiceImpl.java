package com.revature.springrestbackend.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springrestbackend.entity.Book;
import com.revature.springrestbackend.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repository;

	@Override
	public List<Book> getBooks() {
		
		return (List<Book>) repository.findAll();
	}

	@Override
	public Book getBook(Integer id) {
		Optional<Book> book = repository.findById(id);
		if(book.isPresent()) {
			return book.get();
		}else {
			return null;
		}
	}

	@Override
	public Book addBook(Book book) {
		
		return repository.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public Book updateBook(Book book) {
		//If the entity book exists or not 	
		return repository.save(book);
	}

	@Override
	public Book getBookByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
