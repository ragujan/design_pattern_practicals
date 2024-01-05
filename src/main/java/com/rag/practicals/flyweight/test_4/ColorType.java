package com.rag.practicals.flyweight.test_4;

import java.awt.*;

public enum ColorType {
    RED(Color.RED),
    BLUE(Color.BLUE),
    YELLOW(Color.YELLOW);


    private final Color awtColor;

    ColorType(Color awtColor) {
        this.awtColor = awtColor;
    }

    public Color getAwtColor() {
        return awtColor;
    }

}
