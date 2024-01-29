package com.rag.practicals.interpreter_pattern.test_1;

import java.util.Stack;

public class Test {

    public static boolean isOperator(String s){
        if(s.contains("-") || s.contains("+") || s.contains("*")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        final String tokenString = "4 3 2 - 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenList = tokenString.split(" ");

        for (String s:tokenList
             ) {
            if(isOperator(s)){
                System.out.println("yes it is "+s);
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();

                System.out.println("left expression is "+leftExpression.interpret());
                System.out.println("right expression is "+rightExpression.interpret());

                System.out.println("operator "+s);

            }else{
                NumberExpression i = new NumberExpression(s);
                stack.push(i);
                System.out.println("pushed stack is "+i.interpret());
            }
        }

    }
}
