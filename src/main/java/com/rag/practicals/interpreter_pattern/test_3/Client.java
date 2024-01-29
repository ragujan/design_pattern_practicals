package com.rag.practicals.interpreter_pattern.test_3;

public class Client {
    public static void main(String[] args) {
        Context context = new Context("5 + 3 - 2");
        Expression number2 = new Number(2);
        Expression addition = new Add(new Number(5),new Number(3));
        Expression expression = new Substract(addition,number2);

        int result = expression.interpret(context);
        System.out.println("result is "+result);

    }
}
