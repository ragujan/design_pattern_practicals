package com.rag.practicals.test;

public class SimpleTest {
    private String test;


    public void doThis() {
        String innerValue = "you know";
        this.test = innerValue;
        innerValue = "so what's up";
        System.out.println(this.test);
    }

    public static void main(String[] args) {
        SimpleTest test = new SimpleTest();
        test.doThis();
        int x = 5;
        int y = 3;
        System.out.println("x " + x);
        System.out.println("y " + y);
        x = x * y;

        y = x / y;
        x = x / y;
        System.out.println("x " + x);
        System.out.println("y " + y);


    }
}
