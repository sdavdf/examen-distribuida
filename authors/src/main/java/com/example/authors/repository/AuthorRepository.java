package com.example.authors.repository;

import com.example.authors.db.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    List<Author> findAll();
    Optional<Author> findById(int id);
    void save(Author author);
    void update(Author author);
    void delete(int id);
}