package com.rag.practicals.flyweight_pattern.test_4;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();
    private static final HashMap<ColorType, Color> colors = new HashMap<ColorType, Color>();


    public static Shape getShape(ShapeType type, ColorType colorType) {
        Shape shapeImpl = shapes.get(type);
        Color color = colors.get(colorType);

        if (color == null) {
            if (colorType.equals(ColorType.BLUE)) {
               color = ColorType.BLUE.getAwtColor();
            }
            if (colorType.equals(ColorType.RED)) {
                color = ColorType.RED.getAwtColor();
            }
            if (colorType.equals(ColorType.YELLOW)) {
                color = ColorType.YELLOW.getAwtColor();
            }
        }


        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true,color);
            }
            if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false,color);
            }
            if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line(color);
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }


}
