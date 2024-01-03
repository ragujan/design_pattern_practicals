package com.rag.practicals.chain_of_responsibility.test2;

public class ConcreteHandler3 implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getType().equals("Type3")){
            System.out.println("Concreate Handler 3 handling request of Type3");
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
