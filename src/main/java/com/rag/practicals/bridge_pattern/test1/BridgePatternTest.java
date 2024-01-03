package com.rag.practicals.bridge_pattern.test1;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();


        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
