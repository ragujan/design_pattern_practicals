package com.rag.practicals.interpreter_pattern.test_9;

public class Client {
    public static void main(String[] args) {
        PizzaContext context = new PizzaContext();
        String extraCheese = "Extra Cheese";
        String extraSpice = "Extra Spice";

        CommandExpression addExtraCheeseExpression = new AddOptionExpression(extraCheese);
        CommandExpression addExtraSpiceExpression = new AddOptionExpression(extraSpice);
        CommandExpression removeExtraCheeseExpression = new RemoveOptionExpression(extraCheese);

        addExtraCheeseExpression.interpret(context);
        addExtraSpiceExpression.interpret(context);
        removeExtraCheeseExpression.interpret(context);

        System.out.println("Pizza Customized Options are "+context.getCustomizationOptions());
    }
}
