package com.example.authors.repository;

import com.example.authors.db.Author;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class AuthorRepositoryImpl implements AuthorRepository {
    private final List<Author> authors = new CopyOnWriteArrayList<>();

    @Override
    public List<Author> findAll() {
        return authors;
    }

    @Override
    public Optional<Author> findById(int id) {
        return authors.stream()
                .filter(a -> Long.valueOf(a.getId()).equals(id))
                .findFirst();
    }

    @Override
    public void save(Author author) {
        authors.add(author);
    }

    @Override
    public void update(Author author) {
        findById(author.getId()).ifPresent(existingAuthor -> {
            existingAuthor.setName(author.getName());
        });
    }

    @Override
    public void delete(int id) {
        authors.removeIf(a -> Long.valueOf(a.getId()).equals(id));
    }

}
