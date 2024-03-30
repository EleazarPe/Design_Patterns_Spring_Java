package com.example.interpreter;

public class DiviExpression implements Expression{

    Expression left;
    Expression right;

    public DiviExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}
