package com.rag.practicals.mediator_pattern.test6;

import java.util.LinkedList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Actor> actors ;

    public ConcreteMediator() {
        this.actors = new LinkedList<>();
    }
    public void addActor(Actor actor){
        this.actors.add(actor);
    }
    @Override
    public void sendMessage(String message, Actor actor) {
        for (Actor tempActor:actors){
            if(actor != tempActor){
                tempActor.receiveMessage(message);
            }
        }
    }
}
