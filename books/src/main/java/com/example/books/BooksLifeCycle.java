package com.example.books;
import io.helidon.microprofile.server.Server;

public class BooksLifeCycle {

    public static void main(String[] args) {
        Server server = Server.create();
        server.start();
    }
}