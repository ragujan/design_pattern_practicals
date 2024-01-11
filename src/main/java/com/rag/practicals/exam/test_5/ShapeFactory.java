package com.rag.practicals.exam.test_5;

import com.rag.practicals.exam.test_5.shape_decorator.*;
import com.rag.practicals.exam.test_5.shape_decorator.Shape;

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
            System.out.println("colors are newly added " + colorType.name());
            colors.put(colorType, color);
        } else {
            if (colorType.equals(ColorType.BLUE)) {
                color = ColorType.BLUE.getAwtColor();
            }
            if (colorType.equals(ColorType.RED)) {
                color = ColorType.RED.getAwtColor();
            }
            if (colorType.equals(ColorType.YELLOW)) {
                color = ColorType.YELLOW.getAwtColor();
            }
            System.out.println("Selected color already exists " + colors.get(colorType) + " " + colorType.name());
        }


        boolean newShapeFound = false;
        if (shapeImpl == null) {
            newShapeFound = true;
        }

        switch (type) {
            case OVAL_FILL:
                shapeImpl = new Oval(true, color);
                break;
            case OVAL_NOFILL:
                shapeImpl = new Oval(false, color);
                break;
            case LINE:
                shapeImpl = new Line(color);
                break;
            case DOTTED_LINE:
                shapeImpl = new DashedBorderDecorator(new Line(color));
                break;
            case OVAL_FILL_BORDER:
                shapeImpl = new BorderDecorator(new Oval(true, color));
                break;

            default:
                shapeImpl = new Oval(true, color); // Default to Oval with fill
                break;
        }


        if (newShapeFound) {
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }


}
