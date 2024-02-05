package com.rag.practicals.interpreter_pattern.test_9;

public class AddOptionExpression implements CommandExpression{
    private String Option;

    public AddOptionExpression(String Option) {
        this.Option = Option;
    }

    @Override
    public void interpret(PizzaContext context) {
        context.addTopping(Option);
    }
}
