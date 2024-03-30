package com.example.interpreter;

public class SumExpression implements Expression{

    private Expression left;
    private Expression right;

    public SumExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
