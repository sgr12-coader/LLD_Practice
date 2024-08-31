package DesignPatterns.BehavioralDesignPattern.InterpreterPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.add("a", 10);
        context.add("b", 20);
        context.add("c", 30);
        context.add("d", 40);

        AbstractExpression expression = new SumNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        System.out.println("a+b: " + expression.interpret(context));

        expression = new SumNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"));
        System.out.println("c+d: " +expression.interpret(context));

        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new SumNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
        new SumNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println("(a+b)*(c+d): " + expression1.interpret(context));

        AbstractExpression expression2 = new SumMultiplyNonTerminalExpression(new SumMultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '+'),
        new SumMultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"), '+'), '*');
        System.out.println("(a+b)*(c+d) with SumMultiplyNonTerminalExpression: " + expression2.interpret(context));
    }
}
