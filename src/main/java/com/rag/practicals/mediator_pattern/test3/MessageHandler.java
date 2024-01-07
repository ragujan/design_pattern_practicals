package com.rag.practicals.mediator_pattern.test3;

import java.util.LinkedList;
import java.util.List;

public class MessageHandler {
    private List<User> users;

    public MessageHandler() {
        users = new LinkedList<>();
    }

    public void addUsers(User user) {
        users.add(user);
    }

    public void sendMessage(String msg, User user) {
        user.send(msg);
        for (User u : users
        ) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

}
