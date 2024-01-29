package com.rag.practicals.interpreter_pattern.test_5;

public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        System.out.println("context is "+context);
        System.out.println("data is "+data);
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
