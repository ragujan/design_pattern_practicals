package com.rag.practicals.mediator_pattern.test1;

public class Client {
    public static void main(String[] args) {
        ChatMediatorImp mediator = new ChatMediatorImp();


        User rag = new UserImpl(mediator,"rag_jn");
        User david = new UserImpl(mediator,"david");
        User ragbag = new UserImpl(mediator,"rag_bag");


        mediator.adduser(rag);
        mediator.adduser(david);
        mediator.adduser(ragbag);

        rag.send("hi");
//        david.receive("bro");

    }
}
