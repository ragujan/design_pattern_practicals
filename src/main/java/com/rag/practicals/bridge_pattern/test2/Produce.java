package com.rag.practicals.bridge_pattern.test2;

public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
