package com.rag.practicals.flyweight_pattern.test2;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("shared");
        flyweight1.operation("state 1");

        Flyweight flyweight2 = flyweightFactory.getFlyweight("unique");
        flyweight2.operation("state 2");

        Flyweight flyweight3 = flyweightFactory.getFlyweight("shared");
        flyweight3.operation("state 3");

    }
}
