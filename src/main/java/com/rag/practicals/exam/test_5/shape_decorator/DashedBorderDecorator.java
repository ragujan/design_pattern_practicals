package com.rag.practicals.exam.test_5.shape_decorator;

import java.awt.*;

public class DashedBorderDecorator implements ShapeDecorator{
    private Shape shape;

    public DashedBorderDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        decorate(g,x,y,width,height);
    }

    @Override
    public void decorate(Graphics g, int x, int y, int width, int height) {
          drawDashedLine(g,x,y,width,height);
    }
    public void drawDashedLine(Graphics g, int x1, int y1, int x2, int y2){

//        g.setColor(this.color);
        // Create a copy of the Graphics instance
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the stroke of the copy, not the original
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                0, new float[]{9}, 0);
        g2d.setStroke(dashed);

        // Draw to the copy
        g2d.drawLine(x1, y1, x2, y2);

        // Get rid of the copy
        g2d.dispose();
    }

}
