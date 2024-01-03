package com.rag.practicals.chain_of_responsibility.test2;

public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Request request1 = new Request("Type1");
        Request request2 = new Request("Type2");
        Request request3 = new Request("Type3");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);

    }
}
