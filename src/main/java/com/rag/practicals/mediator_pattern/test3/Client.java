package com.rag.practicals.mediator_pattern.test3;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("Mukush");
        User user2 = new User("Marshall");

        MessageHandler messageHandler =  new MessageHandler();
        messageHandler.addUsers(user1);
        messageHandler.addUsers(user2);

//        user1.send("hi marshall");
        messageHandler.sendMessage("hi Marshall",user1);

    }
}
