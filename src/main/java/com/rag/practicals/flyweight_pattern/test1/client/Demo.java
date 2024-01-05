package com.rag.practicals.flyweight_pattern.test1.client;

import com.rag.practicals.flyweight_pattern.test1.forest.Forest;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 3;

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < Math.floor(TREES_TO_DRAW/TREE_TYPES) ; i++) {
            forest.plantTree(random(0,CANVAS_SIZE),random(0,CANVAS_SIZE),"Summer Oak", Color.BLUE, "Oak Texture Stub");
            forest.plantTree(random(0,CANVAS_SIZE),random(0,CANVAS_SIZE),"Autumn Oak", Color.YELLOW, "Autumn Oak Texture Stub");
            forest.plantTree(random(0,CANVAS_SIZE),random(0,CANVAS_SIZE),"Teak Oak", Color.RED, "Spring Teak Texture Stub");

        }
        forest.setSize(CANVAS_SIZE,CANVAS_SIZE);
        forest.setVisible(true);
    }
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
