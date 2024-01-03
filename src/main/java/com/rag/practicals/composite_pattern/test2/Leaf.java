package com.rag.practicals.composite_pattern.test2;

public class Leaf implements Component{

    String name;
    Double price;

    public Leaf(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" price is "+price);
    }
}
