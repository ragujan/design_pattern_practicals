package com.rag.practicals.flyweight_pattern.test_3;

import java.awt.*;

public  class ColorType {
   private Color color;

    public ColorType(Color color) {
        this.color = color;
    }

    void doColoring(Graphics g, int x, int y, int width, int height){

       g.setColor(color);
       g.fillRect(x,y,width,height);

   }

}
