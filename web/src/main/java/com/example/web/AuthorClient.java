package com.example.web;

import com.example.authors.db.Author;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.print.Book;
import java.util.List;

@Path("/authors")
public interface AuthorClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Author> getAuthors();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Author getAuthor(@PathParam("id") Long id);
}

