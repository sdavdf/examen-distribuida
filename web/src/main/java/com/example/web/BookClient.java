package com.example.web;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.print.Book;
import java.util.List;

@Path("/books")
public interface BookClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Book> getBooks();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Book getBook(@PathParam("id") Long id);
}
