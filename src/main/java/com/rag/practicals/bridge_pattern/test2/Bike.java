package com.rag.practicals.bridge_pattern.test2;

public class Bike extends Vehicle{

    public Bike(Workshop workshop1, Workshop workshop2){
        super(workshop1,workshop2);
    }
    @Override
    public void manufacture() {
        System.out.println("bike");
        workshop1.work();
        workshop2.work();
    }
}
