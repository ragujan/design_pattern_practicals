package com.rag.practicals.chain_of_responsibility.test5.middleware;

public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
    @Override
    public boolean check(String email, String password) {

        if(System.currentTimeMillis() > this.currentTime+60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request ++;

        if(request > requestPerMinute){
            System.out.println("Request limit is exceeded");
            Thread.currentThread().start();
        }
        return checkNext(email,password);
    }
}
