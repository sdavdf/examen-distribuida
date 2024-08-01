package com.example.web;


import com.example.authors.db.Author;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.print.Book;
import java.util.List;

@ApplicationScoped
@Path("/web")
public class WebService {

    @Inject
    private AuthorClient authorClient;

    @Inject
    private BookClient bookClient;

    @GET
    @Path("/authors")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Author> getAuthors() {
        return authorClient.getAuthors();
    }

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return bookClient.getBooks();
    }
}