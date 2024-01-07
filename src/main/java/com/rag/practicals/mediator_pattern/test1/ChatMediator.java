package com.rag.practicals.mediator_pattern.test1;

public interface ChatMediator {
    public void sendMessage(String msg,User user);
    void adduser(User user);
}
