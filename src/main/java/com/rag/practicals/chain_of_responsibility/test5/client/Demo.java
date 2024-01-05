package com.rag.practicals.chain_of_responsibility.test5.client;

import com.rag.practicals.chain_of_responsibility.test5.middleware.Middleware;
import com.rag.practicals.chain_of_responsibility.test5.middleware.RoleCheckMiddleware;
import com.rag.practicals.chain_of_responsibility.test5.middleware.ThrottlingMiddleware;
import com.rag.practicals.chain_of_responsibility.test5.middleware.UserExistsMiddleware;
import com.rag.practicals.chain_of_responsibility.test5.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin", "123");
        server.register("user", "456");

        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware());
        server.setMiddleware(middleware);

    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;

        do {
            System.out.print("enter email :");
            String email = reader.readLine();
            System.out.print("input password :");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

}
