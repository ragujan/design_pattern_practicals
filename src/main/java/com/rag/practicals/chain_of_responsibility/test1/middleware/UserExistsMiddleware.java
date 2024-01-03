package com.rag.practicals.chain_of_responsibility.test1.middleware;

import com.rag.practicals.chain_of_responsibility.test1.server.Server;

public class UserExistsMiddleware extends Middleware{
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("this email is not registered");
            return false;
        }
        if(!server.isValidPassword(email,password)){
            System.out.println("wrong password");
            return false;
        }
        return checkNext(email,password);
    }
}
