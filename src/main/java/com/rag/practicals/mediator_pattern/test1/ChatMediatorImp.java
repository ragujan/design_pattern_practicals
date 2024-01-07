package com.rag.practicals.mediator_pattern.test1;

import java.util.LinkedList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator{
    private List<User> users;
    public ChatMediatorImp(){
        users = new LinkedList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        for (User u: users
             ) {
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void adduser(User user) {
        users.add(user);
    }
}
