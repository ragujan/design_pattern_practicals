package com.rag.practicals.interpreter_pattern.test_8;

import java.util.LinkedList;
import java.util.List;

public interface Expression {
    public boolean interpret(String context);
}

class TerminalExpression implements Expression {

    private List<String> expectedData;

    public TerminalExpression(List<String> expectedData) {
        this.expectedData = expectedData;
    }

    @Override
    public boolean interpret(String context) {
//        instead of returning the boolean you should do an actual task
        return expectedData.contains(context);
    }
}

class Test{
    public static void main(String[] args) {
        List<String> commandList = new LinkedList<>();
        commandList.add("Extra Cheese");
        commandList.add("Extra Spice");
        commandList.add("Extra Salt");
        commandList.add("Lower Salt");
        commandList.add("Medium Sauce");
        commandList.add("Less Oil");

        Expression expression = new TerminalExpression(commandList);

        System.out.println("Customer ordered Extra Cheese "+ expression.interpret("Extra Cheese"));
    }
}