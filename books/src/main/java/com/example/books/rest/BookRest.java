package com.example.books.rest;

import com.example.books.db.Book;
import com.example.books.repository.BookRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/books")
@ApplicationScoped
public class BookRest {

    @Inject
    private BookRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> findAll() {
        return repository.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Book> findById(@PathParam("id") int id) {
        return repository.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Book book) {
        repository.save(book);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Book book) {
        repository.update(book);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) {
        repository.delete(id);
    }
}
