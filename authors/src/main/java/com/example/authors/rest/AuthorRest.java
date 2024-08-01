package com.example.authors.rest;

import com.example.authors.db.Author;
import com.example.authors.repository.AuthorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/authors")
@ApplicationScoped
public class AuthorRest {

    @Inject
    private AuthorRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Author> findAll() {
        return repository.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Author> findById(@PathParam("id") int id) {
        return repository.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Author author) {
        repository.save(author);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Author author) {
        repository.update(author);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) {
        repository.delete(id);
    }
}