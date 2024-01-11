package com.rag.practicals.exam.test_5.shape_decorator;

import java.awt.*;

public interface ShapeDecorator extends Shape {
    void decorate(Graphics g, int x, int y, int width, int height);
}
