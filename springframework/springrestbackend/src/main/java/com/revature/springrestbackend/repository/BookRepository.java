package com.revature.springrestbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.springrestbackend.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
