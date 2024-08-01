package com.example.books.repository;


import com.example.books.db.Book;

import java.util.List;
import java.util.Optional;


public interface BookRepository {
    List<Book> findAll();
    Optional<Book> findById(int id);
    void save(Book book);
    void update(Book book);
    void delete(int id);
}