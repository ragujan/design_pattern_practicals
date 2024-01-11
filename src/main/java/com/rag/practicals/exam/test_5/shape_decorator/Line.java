package com.rag.practicals.exam.test_5.shape_decorator;

import java.awt.*;

public class Line implements Shape {
    protected Color color;
    public Line(Color color){
        System.out.println("Creating line object");

        this.color = color;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(color);
        g.drawLine(x,y,width,height);
    }


}
