package com.rag.practicals.flyweight_pattern.test_4.shape_decorator;

import java.awt.*;

public interface Shape {
    public void draw(Graphics g,int x, int y, int width, int height);

    public ShapeType getShapeType();
}
