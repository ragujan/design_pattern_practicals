package com.rag.practicals.bridge_pattern.test2;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.print(" And ");
        System.out.println(" Assembled . ");
    }
}
