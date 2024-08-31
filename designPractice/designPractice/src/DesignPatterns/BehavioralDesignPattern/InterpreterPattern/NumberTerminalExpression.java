package DesignPatterns.BehavioralDesignPattern.InterpreterPattern;

public class NumberTerminalExpression implements AbstractExpression{
    private String number;
    public NumberTerminalExpression(String number){
        this.number=number;
    }
    @Override
    public int interpret(Context context) {
        return  context.get(number);
    }
}
