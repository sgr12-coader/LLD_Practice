package DesignPatterns.BehavioralDesignPattern.InterpreterPattern;

public class SumMultiplyNonTerminalExpression implements AbstractExpression{
    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;
    char operator;

    public SumMultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression, char operator){
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operator=operator;
    }

    @Override
    public int interpret(Context context) {
        if(operator=='+'){
            return (leftExpression.interpret(context) + rightExpression.interpret(context));
        }
        else if(operator=='*'){
            return (leftExpression.interpret(context) * rightExpression.interpret(context));
        }
        return 0;
    }
}
