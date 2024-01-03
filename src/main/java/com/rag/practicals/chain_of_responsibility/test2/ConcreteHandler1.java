package com.rag.practicals.chain_of_responsibility.test2;

public class ConcreteHandler1 implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getType().equals("Type1")){
            System.out.println("Concreate Handler 1 handling request of Type1");
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
