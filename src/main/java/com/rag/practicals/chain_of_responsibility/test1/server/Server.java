package com.rag.practicals.chain_of_responsibility.test1.server;

import com.rag.practicals.chain_of_responsibility.test1.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private final Map<String,String> users = new HashMap<>();
    private Middleware middleware ;


    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    public void register(String email, String password){
        users.put(email,password);
    }
    public boolean login(String email, String password){
        if(middleware.check(email,password)){
            System.out.println("Authorization have been successful");
            return true;
        }
        return false;
    }
    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }
    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
