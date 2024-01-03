package com.rag.practicals.chain_of_responsibility.test1.middleware;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com")){
            System.out.println("hello admin");
            return true;
        }
        System.out.println("hello user");
        return checkNext(email,password);

    }
}
