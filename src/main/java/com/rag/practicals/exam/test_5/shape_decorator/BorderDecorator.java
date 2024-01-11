package com.rag.practicals.exam.test_5.shape_decorator;

import com.rag.practicals.exam.test_5.ColorType;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BorderDecorator implements ShapeDecorator{
    private Shape decoratedShape;
    private ColorType getRandomColorType() {
        List<ColorType> colorTypeList = Arrays.asList(ColorType.values());
        int random = pickRandomNumber(colorTypeList.size());
        return colorTypeList.get(random);
    }
    private static int pickRandomNumber(int count) {
        Random random = new Random();
        return random.nextInt(count );
    }
    public BorderDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(getRandomColorType().getAwtColor());
        decoratedShape.draw(g,x,y,width,height);
        decorate(g,x,y,width,height);
    }



    @Override
    public void decorate(Graphics g, int x, int y, int width, int height) {
        g.drawRect(x - 5, y - 5, width + 10, height + 10);
    }
}
