package com.rag.practicals.mediator_pattern.test3;

import com.rag.practicals.mediator_pattern.test1.ChatMediator;

public class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void send(String msg) {
        System.out.println("user " + name + " sending message " + msg);
    }

    ;

    public void receive(String msg) {
        System.out.println("user " + name + " receiving message " + msg);
    }

    ;
}
