package com.rag.practicals.mediator_pattern.test6;

public class Customer implements Actor{
    private Mediator mediator;
    private String name;

    public Customer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        ConcreteMediator concreteMediator = (ConcreteMediator) mediator;
        concreteMediator.addActor(this);
    }



    @Override
    public void sendMessage(String message) {
          mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives messages "+ message);
    }
}
