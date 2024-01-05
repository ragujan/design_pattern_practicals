package com.rag.practicals.flyweight.test_4;

import java.awt.*;

public class Oval implements Shape{

    private boolean fill;

    Color color;

    public Oval(boolean fill,Color color) {
        this.fill = fill;
        this.color = color;

        System.out.println("Creating Oval object with fill="+fill);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height ) {
           g.setColor(color);
           g.drawOval(x,y,width,height);
           if(fill){
               g.fillOval(x,y,width,height);
           }
    }


}
