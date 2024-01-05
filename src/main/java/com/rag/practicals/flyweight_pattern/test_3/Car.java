package com.rag.practicals.flyweight_pattern.test_3;

import java.awt.*;

public class Car {
    private String model;
    private ColorType colorType;

    private int x,y,width,height;

    public Car(String model, ColorType colorType, int x, int y, int width, int height) {
        this.model = model;
        this.colorType = colorType;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics){
        this.colorType.doColoring(graphics,x,y,width,height);
    }
}
