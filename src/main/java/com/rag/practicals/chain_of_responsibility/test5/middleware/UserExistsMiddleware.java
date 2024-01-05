package com.rag.practicals.chain_of_responsibility.test5.middleware;

import com.rag.practicals.chain_of_responsibility.test5.server.Server;
import com.sun.security.jgss.GSSUtil;

public class UserExistsMiddleware extends Middleware{
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("This email is not registered");
            return false;
        }

        if(!server.isValidPassword(email,password)){
            System.out.println("Wrong Password");
            return false;
        }
        return checkNext(email,password);
    }
}
