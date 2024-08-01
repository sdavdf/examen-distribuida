package com.example.books.repository;

import com.example.books.db.Book;


import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class BookRepositoryImpl implements BookRepository {
    private final List<Book> books = new CopyOnWriteArrayList<>();

    @Override
    public List<Book> findAll() {
        return books;
    }
    @Override
    public Optional<Book> findById(int id) {
        return books.stream()
                .filter(a -> Long.valueOf(a.getId()).equals(id))
                .findFirst();
    }

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public void update(Book book) {
        findById(book.getId()).ifPresent(existingBook -> {
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
        });
    }

    @Override
    public void delete(int id) {
        books.removeIf(a -> Long.valueOf(a.getId()).equals(id));
    }
}