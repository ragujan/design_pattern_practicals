package com.rag.practicals.interpreter_pattern.test_3;

public class Number implements Expression{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
