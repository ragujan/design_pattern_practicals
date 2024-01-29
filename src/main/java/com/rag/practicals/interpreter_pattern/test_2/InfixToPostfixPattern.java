package com.rag.practicals.interpreter_pattern.test_2;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern{
    @Override
    public String conversion(String expression) {
        Stack<Character> operators = new Stack<>();

        char symbol;
        String postfix = "";

        for(int i = 0; i<expression.length(); i++){
            symbol = expression.charAt(i);

            if(Character.isLetter(symbol)){
                postfix = postfix + symbol;
                System.out.println("post fix "+postfix);
            }else if(symbol == '('){
                operators.push(symbol);
            }else if(symbol == ')'){
                while (operators.peek() != '('){
                    postfix = postfix+operators.pop();
                }
                operators.pop();
            }else {

            }

        }

            return null;
    }

    public static int prec(char x)
    {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}
