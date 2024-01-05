package com.rag.practicals.chain_of_responsibility.test5.middleware;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {

        if(email.equals("admin")){
            System.out.println("hello admin");
            return true;
        }
        System.out.println("Hello user");
        return checkNext(email,password);
    }
}
