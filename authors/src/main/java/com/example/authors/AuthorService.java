package com.example.authors;

import io.helidon.microprofile.server.Server;

public class AuthorService {
    public static void main(String[] args) {
        Server server = Server.create();
        server.start();
    }

}
