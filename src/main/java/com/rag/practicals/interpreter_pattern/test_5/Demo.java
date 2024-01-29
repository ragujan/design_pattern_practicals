package com.rag.practicals.interpreter_pattern.test_5;

public class Demo {
    //    Robert and John are male
    public static Expression getMaleExpression() {
        Expression ragbag = new TerminalExpression("RagBag");
        Expression rag = new TerminalExpression("Rag");
        Expression combination1 = new OrExpression(ragbag, rag);
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression combination2 = new OrExpression(robert, john);
        return new OrExpression(combination1, combination2);

    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomanExpression();
        System.out.println("Rag is a male "+isMale.interpret("Rag"));
        System.out.println("Julie is a married woman? "+isMarriedWomen.interpret("Married Julie"));

    }

}
