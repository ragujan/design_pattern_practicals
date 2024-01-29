package com.rag.practicals.interpreter_pattern.test_1;

public class NumberExpression extends Expression{
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {

        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}
