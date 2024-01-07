package com.rag.practicals.mediator_pattern.test1;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("Sending message from " + this.name);
        System.out.println("messsage is " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Recived message to " + this.name);
        System.out.println("messsage is " + msg);

    }
}
