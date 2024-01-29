package com.rag.practicals.interpreter_pattern.test_3;

public class Add implements Expression{
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {

        return left.interpret(context) + right.interpret(context);

    }
}
