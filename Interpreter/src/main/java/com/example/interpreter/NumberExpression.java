package com.example.interpreter;

public class NumberExpression implements Expression {

    private float number;

    public NumberExpression(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    @Override
    public float interpret(Context context) {
        return this.number;
    }
}
