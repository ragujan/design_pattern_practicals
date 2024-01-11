package com.rag.practicals.flyweight_pattern.test_4;

import com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Line;
import com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Oval;
import com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Shape;
import com.rag.practicals.flyweight_pattern.test_4.shape_decorator.ShapeType;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Shape> shapes = new HashMap<ShapeType, com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Shape>();
    private static final HashMap<ColorType, Color> colors = new HashMap<ColorType, Color>();


    public static com.rag.practicals.flyweight_pattern.test_4.shape_decorator.Shape getShape(ShapeType type, ColorType colorType) {
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
