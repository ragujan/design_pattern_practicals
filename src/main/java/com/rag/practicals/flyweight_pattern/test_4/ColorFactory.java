package com.rag.practicals.flyweight_pattern.test_4;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private static Map<ColorType, Color>  colorTypeMap = new HashMap<>();

    public static Color getColor(ColorType colorType){
        Color color = colorTypeMap.get(colorType);

        if(color == null){
            if(colorType == ColorType.BLUE){
                color = ColorType.BLUE.getAwtColor();
            }
            if(colorType == ColorType.RED){
                color = ColorType.RED.getAwtColor();
            }
            if(colorType == ColorType.YELLOW){
                color = ColorType.YELLOW.getAwtColor();
            }
        }
        return color;
    }
}
