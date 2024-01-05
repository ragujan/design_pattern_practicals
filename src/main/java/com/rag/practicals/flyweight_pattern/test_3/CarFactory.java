package com.rag.practicals.flyweight_pattern.test_3;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private Map<String,ColorType>  colorTypes = new HashMap<>();


    public ColorType getColorType(String colorName, Color color){
        ColorType colorType = colorTypes.get(colorName);
         if(colorTypes.get(colorName) == null ){
             colorTypes.put(colorName,new ColorType(color));
             return colorTypes.get(colorName);
         }
         return colorType;

    }
}
