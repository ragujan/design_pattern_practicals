package com.rag.practicals.bridge_pattern.test1;

public class Triangle extends Shape{

    public Triangle(Color c){
        super(c);
    }
    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color");
        color.applyColor();
    }
}
