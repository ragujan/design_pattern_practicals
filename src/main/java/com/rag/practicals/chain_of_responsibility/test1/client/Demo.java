package com.rag.practicals.chain_of_responsibility.test1.client;

import com.rag.practicals.chain_of_responsibility.test1.middleware.Middleware;
import com.rag.practicals.chain_of_responsibility.test1.middleware.RoleCheckMiddleware;
import com.rag.practicals.chain_of_responsibility.test1.middleware.ThrottlingMiddleware;
import com.rag.practicals.chain_of_responsibility.test1.middleware.UserExistsMiddleware;
import com.rag.practicals.chain_of_responsibility.test1.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

    }

    public static void main(String[] args) throws IOException {
        init();


        boolean success;
        do {
            System.out.print("Enter Email: ");
            String email = reader.readLine();
            System.out.println("Input Password: ");
            String password = reader.readLine();
            success = server.isValidPassword(email,password);
        }while (!success
        );
    }

}
