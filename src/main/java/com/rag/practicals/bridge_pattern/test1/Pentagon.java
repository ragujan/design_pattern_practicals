package com.rag.practicals.bridge_pattern.test1;

public class Pentagon extends Shape {
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
