package com.rag.practicals.interpreter_pattern.test_9;

public class RemoveOptionExpression implements CommandExpression{
    private String Option;

    public RemoveOptionExpression(String Option) {
        this.Option = Option;
    }

    @Override
    public void interpret(PizzaContext context) {
        context.addTopping(Option);
    }
}
