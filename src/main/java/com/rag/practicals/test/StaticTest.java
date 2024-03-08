package com.rag.practicals.test;

public class StaticTest {
    static int x = 100;
    public static void main(String[] args) {
        int y = StaticTest.x;
        System.out.println("y is "+y);
        y = 222;
        System.out.println("x is "+x);
        System.out.println("y is "+y);
    }
}
