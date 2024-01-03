package com.rag.practicals.chain_of_responsibility.test2;

public class ConcreteHandler2 implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
       if(request.getType().equals("Type2")){
           System.out.println("Concrete Handler 2 handling the request of Type 2");
       }else if(nextHandler  != null){
           nextHandler.handleRequest(request);
       }
    }
}
