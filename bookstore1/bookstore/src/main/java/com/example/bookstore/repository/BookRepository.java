package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookstore.entity.Book;

@CrossOrigin("*")

public interface BookRepository extends JpaRepository<Book, Long> {

}
